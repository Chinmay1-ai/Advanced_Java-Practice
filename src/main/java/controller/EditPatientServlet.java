package controller;

import dao.PatientDAO;
import model.Patient;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/EditPatientServlet")
public class EditPatientServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Patient patient = PatientDAO.getPatientById(id);

        request.setAttribute("patient", patient);

        RequestDispatcher rd =
                request.getRequestDispatcher("admin/edit-patient.jsp");
        rd.forward(request, response);
    }
}