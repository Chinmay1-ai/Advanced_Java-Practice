package controller;

import java.io.IOException;
import java.util.List;

import dao.DoctorDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Doctor;

@WebServlet("/loadBookAppointment")
public class LoadBookAppointmentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			// get patient id
			int patientId = Integer.parseInt(request.getParameter("patientId"));

			// ✅ fetch doctors
			List<Doctor> doctorList = DoctorDAO.getAllDoctors();

			// send to JSP
			request.setAttribute("doctorList", doctorList);
			request.setAttribute("patientId", patientId);

			// open page
			RequestDispatcher rd = request.getRequestDispatcher("/patient/book-appointment.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("patient/dashboard.jsp");
		}
	}
}