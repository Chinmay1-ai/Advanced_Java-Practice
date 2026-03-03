package controller;

import dao.DoctorDAO;
import model.Doctor;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/EditDoctorServlet")
public class EditDoctorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Doctor doctor = DoctorDAO.getDoctorById(id);

        request.setAttribute("doctor", doctor);

        RequestDispatcher rd =
                request.getRequestDispatcher("admin/edit-doctor.jsp");
        rd.forward(request, response);
    }
}