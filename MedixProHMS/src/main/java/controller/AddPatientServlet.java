package controller;

import java.io.IOException;

import dao.PatientDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Patient;

@WebServlet("/addPatient")
public class AddPatientServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Patient p = new Patient();

		p.setFullName(request.getParameter("fullName"));
		p.setEmail(request.getParameter("email"));
		p.setGender(request.getParameter("gender"));
		p.setDob(request.getParameter("dob"));
		p.setBloodGroup(request.getParameter("bloodGroup"));
		p.setPhone(request.getParameter("phone"));
		p.setAddress(request.getParameter("address"));

		String password = request.getParameter("password");

		boolean status = PatientDAO.addPatient(p, password);

		if (status)
			response.sendRedirect(request.getContextPath()+ "/admin/manage-patient.jsp?success=Patient Added Successfully");		
		else
			response.sendRedirect("admin/manage-patient.jsp?error=Failed");
	}
}
