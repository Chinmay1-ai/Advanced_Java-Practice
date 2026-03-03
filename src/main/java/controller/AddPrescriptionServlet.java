package controller;

import java.io.IOException;

import dao.BillDAO;
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

		try {

			// Fetch parameters
			int appointmentId = Integer.parseInt(request.getParameter("appointmentId"));
			int doctorId = Integer.parseInt(request.getParameter("doctorId"));
			int patientId = Integer.parseInt(request.getParameter("patientId"));

			String medicines = request.getParameter("medicines");
			String notes = request.getParameter("notes");

			// Save prescription
			boolean status = PrescriptionDAO.addPrescription(appointmentId, doctorId, patientId, medicines, notes);

			// ✅ If prescription saved → generate bill automatically
			if (status) {

				BillDAO billDAO = new BillDAO();

				// Example consultation fee (can be dynamic later)
				double consultationFee = 500.0;

				billDAO.createBill(patientId, consultationFee);

				response.sendRedirect("doctor/dashboard.jsp?success=Prescription Added & Bill Generated");
			} else {
				response.sendRedirect("doctor/dashboard.jsp?error=Failed to add prescription");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("doctor/dashboard.jsp?error=Server Error");
		}
	}
}