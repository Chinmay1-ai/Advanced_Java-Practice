package controller;

import java.io.IOException;
import java.util.List;

import dao.AppointmentDAO;
import dao.PatientDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Appointment;
import model.Patient;

@WebServlet("/viewPatient")
public class ViewPatientServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int patientId = Integer.parseInt(request.getParameter("id"));

		// Patient Details
		Patient patient = PatientDAO.getPatientById(patientId);

		// Appointment List
		List<Appointment> appointments = AppointmentDAO.getAppointmentsByPatient(patientId);

		request.setAttribute("patient", patient);
		request.setAttribute("appointments", appointments);

		RequestDispatcher rd = request.getRequestDispatcher("patient/patient-profile.jsp");

		rd.forward(request, response);
	}
}