package controller;

import java.io.IOException;

import dao.AppointmentDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/doctorAppointments")
public class DoctorAppointmentsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int doctorId = Integer.parseInt(request.getParameter("doctorId"));

		request.setAttribute("appointments", AppointmentDAO.getAppointmentsByDoctor(doctorId));

		RequestDispatcher rd = request.getRequestDispatcher("/doctor/appointments.jsp");

		rd.forward(request, response);
	}
}