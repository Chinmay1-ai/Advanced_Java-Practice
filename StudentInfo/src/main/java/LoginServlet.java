import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE email=? AND password=?");

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				// Create session
				HttpSession session = request.getSession();
				session.setAttribute("userEmail", email);
				session.setAttribute("userName", rs.getString("full_name"));

				response.sendRedirect("dashboard");

			} else {
				response.getWriter().println("Invalid Email or Password!");
			}

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			response.getWriter().println("Error: " + e.getMessage());
		}
	}
}