package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import dao.AppointmentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bookAppointment")
public class BookAppointmentServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			/*
			 * ============================== 1. READ PARAMETERS SAFELY
			 * ==============================
			 */

			String patientStr = request.getParameter("patientId");
			String doctorStr = request.getParameter("doctorId");
			String dateStr = request.getParameter("date");
			String timeStr = request.getParameter("time");

			// ✅ Validation (prevents HTTP 500)
			if (patientStr == null || doctorStr == null || dateStr == null || timeStr == null || patientStr.isEmpty()
					|| doctorStr.isEmpty() || dateStr.isEmpty() || timeStr.isEmpty()) {

				response.sendRedirect(request.getContextPath() + "/patient/dashboard.jsp?error=Invalid Input");
				return;
			}

			/*
			 * ============================== 2. CONVERT VALUES
			 * ==============================
			 */

			int patientId = Integer.parseInt(patientStr);
			int doctorId = Integer.parseInt(doctorStr);

			Date date = Date.valueOf(dateStr);

			// HTML time gives HH:mm → SQL needs HH:mm:ss
			Time time = Time.valueOf(timeStr + ":00");

			/*
			 * ============================== 3. SAVE APPOINTMENT
			 * ==============================
			 */

			boolean status = AppointmentDAO.bookAppointment(patientId, doctorId, date, time);

			/*
			 * ============================== 4. REDIRECT BACK TO PROFILE
			 * ==============================
			 */

			if (status) {

				response.sendRedirect(request.getContextPath() + "/viewPatient?id=" + patientId
						+ "&success=Appointment Booked Successfully");

			} else {

				response.sendRedirect(request.getContextPath() + "/viewPatient?id=" + patientId
						+ "&error=Appointment Booking Failed");
			}

		} catch (Exception e) {

			// ✅ Prevents server crash
			e.printStackTrace();

			response.sendRedirect(request.getContextPath() + "/patient/dashboard.jsp?error=Server Error");
		}
	}
}