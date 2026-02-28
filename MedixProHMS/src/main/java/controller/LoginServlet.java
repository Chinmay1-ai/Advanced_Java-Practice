package controller;

import dao.DBConnection;
import dao.DoctorDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con
					.prepareStatement("SELECT * FROM users WHERE email=? AND password=? AND status='ACTIVE'");

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				HttpSession session = request.getSession();
				session.setAttribute("userId", rs.getInt("user_id"));
				session.setAttribute("userName", rs.getString("full_name"));
				session.setAttribute("userRole", rs.getString("role"));

				String role = rs.getString("role");

				switch (role) {
				case "ADMIN":
					response.sendRedirect("admin/dashboard.jsp");
					break;
				case "DOCTOR":

					int userId = rs.getInt("user_id");

					int doctorId = DoctorDAO.getDoctorIdByUserId(userId);

					session.setAttribute("doctorId", doctorId);

					response.sendRedirect("doctor/dashboard.jsp");
					break;
				case "RECEPTIONIST":
					response.sendRedirect("receptionist/dashboard.jsp");
					break;
				case "LAB":
					response.sendRedirect("lab/dashboard.jsp");
					break;
				case "PATIENT":
					response.sendRedirect("patient/dashboard.jsp");
					break;
				default:
					response.sendRedirect("login.jsp");
				}

			} else {
				response.sendRedirect("login.jsp?error=Invalid Credentials");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}