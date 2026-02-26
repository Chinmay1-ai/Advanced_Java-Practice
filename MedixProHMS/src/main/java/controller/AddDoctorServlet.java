package controller;

import dao.DoctorDAO;
import model.Doctor;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/addDoctor")
public class AddDoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Doctor doctor = new Doctor();
        doctor.setFullName(request.getParameter("fullName"));
        doctor.setEmail(request.getParameter("email"));
        doctor.setSpecialization(request.getParameter("specialization"));
        doctor.setExperience(Integer.parseInt(request.getParameter("experience")));
        doctor.setDeptId(Integer.parseInt(request.getParameter("deptId")));

        String password = request.getParameter("password");

        boolean status = DoctorDAO.addDoctor(doctor, password);

        if (status) {
            response.sendRedirect("admin/manage-doctors.jsp?success=Doctor Added Successfully");
        } else {
            response.sendRedirect("admin/manage-doctors.jsp?error=Something went wrong");
        }
    }
}