package controller;

import java.io.IOException;

import dao.PrescriptionDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addPrescription")
public class AddPrescriptionServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int appointmentId = Integer.parseInt(request.getParameter("appointmentId"));

		int doctorId = Integer.parseInt(request.getParameter("doctorId"));

		int patientId = Integer.parseInt(request.getParameter("patientId"));

		String medicines = request.getParameter("medicines");
		String notes = request.getParameter("notes");

		boolean status = PrescriptionDAO.addPrescription(appointmentId, doctorId, patientId, medicines, notes);

		if (status) {
			response.sendRedirect("doctor/dashboard.jsp?success=Prescription Added");
		}
	}
}
