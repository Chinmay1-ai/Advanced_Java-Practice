import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String mobNo = request.getParameter("mobNo");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");
        String address = request.getParameter("address");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

            PreparedStatement ps = c.prepareStatement(
                    "insert into institute(name,email,password,mobNo,gender,course,address) values(?,?,?,?,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, mobNo);
            ps.setString(5, gender);
            ps.setString(6, course);
            ps.setString(7, address);

            int rows = ps.executeUpdate();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registration Result</title>");
            out.println("<link rel='stylesheet' href='style.css'>");
            out.println("</head>");
            out.println("<body class='result-wrapper'>");

            out.println("<div class='result-card'>");

            if (rows > 0) {
                out.println("<h2 class='success'>Registration Successful!</h2>");
                out.println("<p>The student has been successfully added to the system.</p>");
            } else {
                out.println("<h2 class='error'>Registration Failed</h2>");
                out.println("<p>Unable to insert data. Please try again.</p>");
            }

            out.println("<a href='index.html'>← Back to Home</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");

            ps.close();
            c.close();

        } catch (Exception e) {
            out.println("<h3 style='color:red;text-align:center;'>Error: " + e.getMessage() + "</h3>");
        }
    }
}