package controller;

import java.io.IOException;
import java.util.List;

import dao.PrescriptionDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prescription;

@WebServlet("/viewPrescriptions")
public class ViewPrescriptionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String patientIdStr = request.getParameter("patientId");

		// ✅ Safety check
		if (patientIdStr == null || patientIdStr.isEmpty()) {

			response.sendRedirect(request.getContextPath() + "/admin/manage-patient.jsp?error=Invalid Patient");
			return;
		}

		int patientId = Integer.parseInt(patientIdStr);

		List<Prescription> prescriptions = PrescriptionDAO.getPrescriptionsByPatient(patientId);

		request.setAttribute("prescriptions", prescriptions);

		RequestDispatcher rd = request.getRequestDispatcher("/patient/prescriptions.jsp");

		rd.forward(request, response);
	}
}