package controller;

import dao.PatientDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/deletePatient")
public class DeletePatientServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        PatientDAO.deletePatient(id);

        response.sendRedirect(
            request.getContextPath()
            + "/admin/manage-patient.jsp?success=Patient Deleted Successfully");
    }
}