package controller;

import java.io.IOException;

import dao.AppointmentDAO;
import dao.DoctorSlotDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DoctorSlot;

@WebServlet("/bookAppointment")
public class BookAppointmentServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int patientId = Integer.parseInt(request.getParameter("patientId"));

		int doctorId = Integer.parseInt(request.getParameter("doctorId"));

		int slotId = Integer.parseInt(request.getParameter("slotId"));

		// ✅ get slot details
		DoctorSlot slot = DoctorSlotDAO.getSlotById(slotId);

		boolean status = AppointmentDAO.bookAppointment(patientId, doctorId, slot.getSlotDate(), slot.getSlotTime());

		if (status) {

			// ✅ mark slot booked
			DoctorSlotDAO.markSlotBooked(slotId);

			response.sendRedirect(request.getContextPath() + "/viewPatient?id=" + patientId
					+ "&success=Appointment Booked Successfully");

		} else {

			response.sendRedirect(request.getContextPath() + "/viewPatient?id=" + patientId + "&error=Booking Failed");
		}
	}
}