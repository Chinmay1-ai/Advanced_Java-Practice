package controller;

import java.io.IOException;

import dao.BillDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/payBill")
public class PayBillServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		// SECURITY CHECK
		if (session == null || !"PATIENT".equals(session.getAttribute("userRole"))) {

			response.sendRedirect("access-denied.jsp");
			return;
		}

		try {

			int billId = Integer.parseInt(request.getParameter("billId"));

			BillDAO dao = new BillDAO();
			dao.updateBillStatus(billId);

			response.sendRedirect(request.getHeader("referer"));

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
	}
}