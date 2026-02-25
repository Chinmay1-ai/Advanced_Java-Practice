import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userRegister")
public class UserRegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullName = request.getParameter("full_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee",
                    "root",
                    "root");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO users(full_name, email, password) VALUES (?, ?, ?)");

            ps.setString(1, fullName);
            ps.setString(2, email);
            ps.setString(3, password);

            ps.executeUpdate();

            ps.close();
            con.close();

            response.sendRedirect("index.html?msg=created");

        } catch (Exception e) {
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}