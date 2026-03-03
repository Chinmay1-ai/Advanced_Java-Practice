package controller;

import java.io.IOException;

import dao.AppointmentDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateAppointmentStatus")
public class UpdateAppointmentStatusServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String status = request.getParameter("status");
		int doctorId = Integer.parseInt(request.getParameter("doctorId"));

		AppointmentDAO.updateAppointmentStatus(id, status);

		response.sendRedirect(request.getContextPath() + "/doctorAppointments?doctorId=" + doctorId);
	}
}
