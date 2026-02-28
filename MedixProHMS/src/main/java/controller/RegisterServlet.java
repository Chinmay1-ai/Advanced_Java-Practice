package controller;

import java.io.IOException;

import dao.UserDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registerUser")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String role = req.getParameter("role");
		String name = req.getParameter("fullName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		UserDAO.registerUser(name, email, password, role);

		resp.sendRedirect("login.jsp?success=Registered Successfully");
	}
}
