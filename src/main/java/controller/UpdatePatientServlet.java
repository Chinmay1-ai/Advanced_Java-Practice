package controller;

import dao.PatientDAO;
import model.Patient;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/UpdatePatientServlet")
public class UpdatePatientServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        Patient p = new Patient();

        p.setPatientId(
            Integer.parseInt(request.getParameter("patientId"))
        );

        p.setGender(request.getParameter("gender"));
        p.setDob(request.getParameter("dob"));
        p.setBloodGroup(request.getParameter("bloodGroup"));
        p.setPhone(request.getParameter("phone"));
        p.setAddress(request.getParameter("address"));

        boolean updated = PatientDAO.updatePatient(p);

        if(updated)
            response.sendRedirect(request.getContextPath()
                + "/admin/manage-patient.jsp?success=Patient Updated");
        else
            response.sendRedirect(request.getContextPath()
                + "/admin/manage-patient.jsp?error=Update Failed");
    }
}