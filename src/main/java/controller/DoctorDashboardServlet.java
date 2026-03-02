package controller;

import java.io.IOException;

import dao.AppointmentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/doctorDashboard")
public class DoctorDashboardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("doctorId") == null) {

			response.sendRedirect("login.jsp");
			return;
		}

		int doctorId = (Integer) session.getAttribute("doctorId");

		
		int pending = AppointmentDAO.getPendingCount(doctorId);
		int approved = AppointmentDAO.getApprovedCount(doctorId);
		int rejected = AppointmentDAO.getRejectedCount(doctorId);

		request.setAttribute("pending", pending);
		request.setAttribute("approved", approved);
		request.setAttribute("rejected", rejected);

		request.getRequestDispatcher("doctor/dashboard.jsp").forward(request, response);
	}
}