package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.DBConnection;
import dao.DoctorDAO;
import dao.PatientDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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

				int userId = rs.getInt("user_id");
				String role = rs.getString("role");

				session.setAttribute("userId", userId);
				session.setAttribute("userName", rs.getString("full_name"));
				session.setAttribute("userRole", role);

				switch (role) {

				// ================= ADMIN =================
				case "ADMIN":
					response.sendRedirect("admin/dashboard.jsp");
					break;

				// ================= DOCTOR =================
				case "DOCTOR":

					int doctorId = DoctorDAO.getDoctorIdByUserId(userId);
					session.setAttribute("doctorId", doctorId);

					response.sendRedirect("doctorDashboard");
					break;

				// ================= PATIENT =================
				case "PATIENT":

					// 🔥 VERY IMPORTANT FIX
					int patientId = PatientDAO.getPatientIdByUserId(userId);
					session.setAttribute("patientId", patientId);

					response.sendRedirect("patient/dashboard.jsp");
					break;

				// ================= RECEPTIONIST =================
				case "RECEPTIONIST":
					response.sendRedirect("receptionist/dashboard.jsp");
					break;

				// ================= LAB =================
				case "LAB":
					response.sendRedirect("lab/dashboard.jsp");
					break;

				default:
					response.sendRedirect("login.jsp");
				}

			} else {
				response.sendRedirect("login.jsp?error=Invalid Credentials");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("login.jsp?error=Server Error");
		}
	}
}