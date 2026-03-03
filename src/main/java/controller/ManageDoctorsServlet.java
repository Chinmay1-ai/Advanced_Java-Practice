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

@WebServlet("/manageDoctors")
public class ManageDoctorsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Doctor> list = DoctorDAO.getAllDoctors();

		request.setAttribute("list", list);

		RequestDispatcher rd = request.getRequestDispatcher("admin/manage-doctors.jsp");
		rd.forward(request, response);
	}
}