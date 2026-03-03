package controller;

import java.io.IOException;
import java.util.List;

import dao.AppointmentDAO;
import dao.BillDAO;
import dao.PatientDAO;
import dao.PrescriptionDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Appointment;
import model.Bill;
import model.Patient;
import model.Prescription;

@WebServlet("/viewPatient")
public class ViewPatientServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			int id = Integer.parseInt(request.getParameter("id"));

			// ================= PATIENT =================
			PatientDAO patientDAO = new PatientDAO();
			Patient patient = patientDAO.getPatientById(id);

			// ================= APPOINTMENTS =================
			AppointmentDAO appointmentDAO = new AppointmentDAO();
			List<Appointment> appointments = appointmentDAO.getAppointmentsByPatient(id);

			// ================= PRESCRIPTIONS =================
			PrescriptionDAO prescriptionDAO = new PrescriptionDAO();
			List<Prescription> prescriptions = prescriptionDAO.getPrescriptionsByPatient(id);

			// ================= BILLS =================
			BillDAO billDAO = new BillDAO();
			List<Bill> bills = billDAO.getBillsByPatient(id);

			// ================= SEND DATA TO JSP =================
			request.setAttribute("patient", patient);
			request.setAttribute("appointments", appointments);
			request.setAttribute("prescriptions", prescriptions);
			request.setAttribute("bills", bills);

			request.getRequestDispatcher("patient/patient-profile.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("admin/manage-patient.jsp?error=Unable to load patient");
		}
	}
}