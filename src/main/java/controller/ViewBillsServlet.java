package controller;

import java.io.IOException;
import java.util.List;

import dao.BillDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Bill;

@WebServlet("/viewBills")
public class ViewBillsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("patientId") == null) {
			response.sendRedirect("login.jsp");
			return;
		}

		int patientId = (int) session.getAttribute("patientId");

		BillDAO dao = new BillDAO();
		List<Bill> bills = dao.getBillsByPatient(patientId);

		request.setAttribute("billList", bills);

		request.getRequestDispatcher("patient/bills.jsp").forward(request, response);
	}
}