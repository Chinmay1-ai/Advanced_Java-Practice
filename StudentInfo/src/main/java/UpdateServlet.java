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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String mobNo = request.getParameter("mobNo");
		String gender = request.getParameter("gender");
		String course = request.getParameter("course");
		String address = request.getParameter("address");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			PreparedStatement ps = c.prepareStatement(
					"update institute set name=?, password=?, mobNo=?, gender=?, course=?, address=? where email=?");

			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, mobNo);
			ps.setString(4, gender);
			ps.setString(5, course);
			ps.setString(6, address);
			ps.setString(7, email);

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			int rows = ps.executeUpdate();

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Update Result</title>");
			out.println("<link rel='stylesheet' href='style.css'>");
			out.println("</head>");
			out.println("<body class='result-wrapper'>");

			out.println("<div class='result-card'>");

			if (rows > 0) {
				out.println("<h2 class='success'>Update Successful!</h2>");
				out.println("<p>The student details have been updated successfully.</p>");
			} else {
				out.println("<h2 class='error'>Update Failed</h2>");
				out.println("<p>No record found with the provided email.</p>");
			}

			out.println("<a href='index.html'>← Back to Home</a>");

			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}