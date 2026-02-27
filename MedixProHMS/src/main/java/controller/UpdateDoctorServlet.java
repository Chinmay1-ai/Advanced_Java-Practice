package controller;

import dao.DoctorDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/UpdateDoctorServlet")
public class UpdateDoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("doctorId"));
        String specialization = request.getParameter("specialization");
        int experience = Integer.parseInt(request.getParameter("experience"));
        int deptId = Integer.parseInt(request.getParameter("deptId"));

        DoctorDAO.updateDoctor(id, specialization, experience, deptId);

        response.sendRedirect(request.getContextPath()
                + "/admin/manage-doctors.jsp?success=Doctor Updated Successfully");    }
}