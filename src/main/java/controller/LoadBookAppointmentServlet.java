package controller;

import java.io.IOException;
import java.util.List;

import dao.DoctorDAO;
import dao.DoctorSlotDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Doctor;
import model.DoctorSlot;

@WebServlet("/loadBookAppointment")
public class LoadBookAppointmentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			int patientId = Integer.parseInt(request.getParameter("patientId"));

			// Load doctors
			List<Doctor> doctorList = DoctorDAO.getAllDoctors();
			request.setAttribute("doctorList", doctorList);
			request.setAttribute("patientId", patientId);

			String doctorIdStr = request.getParameter("doctorId");
			String date = request.getParameter("date");

			// Load slots ONLY when doctor + date selected
			if (doctorIdStr != null && date != null && !doctorIdStr.isEmpty() && !date.isEmpty()) {

				int doctorId = Integer.parseInt(doctorIdStr);

				List<DoctorSlot> slotList = DoctorSlotDAO.getAvailableSlots(doctorId, date);

				request.setAttribute("slotList", slotList);
			}

			RequestDispatcher rd = request.getRequestDispatcher("patient/book-appointment.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}