package controller;

import dao.DoctorDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/deleteDoctor")
public class DeleteDoctorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        DoctorDAO.deleteDoctor(id);

        response.sendRedirect(request.getContextPath()+"/admin/manage-doctors?success=Doctor Deleted Successfully");
    }
}