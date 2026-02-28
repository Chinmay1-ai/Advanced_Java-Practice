package controller;

import dao.DepartmentDAO;
import model.Department;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/admin/manage-doctors")
public class ManageDoctorsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Fetch departments from DB
		DepartmentDAO deptDAO = new DepartmentDAO();
		List<Department> departments = deptDAO.getAllDepartments();

		// Send data to JSP
		request.setAttribute("departments", departments);

		// Forward to JSP
		RequestDispatcher rd = request.getRequestDispatcher("/admin/manage-doctors.jsp");
		rd.forward(request, response);
	}
}