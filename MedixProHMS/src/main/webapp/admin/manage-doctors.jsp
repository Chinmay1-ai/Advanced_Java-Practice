<%@ page import="java.util.*, dao.DoctorDAO, model.Doctor" %>

<%
    if(session.getAttribute("userRole") == null ||
       !session.getAttribute("userRole").equals("ADMIN")) {
        response.sendRedirect("../login.jsp");
        return;
    }

    List<Doctor> doctors = DoctorDAO.getAllDoctors();
%>

<jsp:include page="../includes/header.jsp">
    <jsp:param name="pageTitle" value="Manage Doctors"/>
</jsp:include>

<div class="d-flex justify-content-between align-items-center mb-3">
    <h3>Manage Doctors</h3>
    <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addDoctorModal">
        + Add Doctor
    </button>
</div>

<!-- Alerts -->
<% if(request.getParameter("success") != null){ %>
    <div class="alert alert-success">
        <%= request.getParameter("success") %>
    </div>
<% } %>

<% if(request.getParameter("error") != null){ %>
    <div class="alert alert-danger">
        <%= request.getParameter("error") %>
    </div>
<% } %>

<!-- Doctors Table -->
<div class="card shadow-sm">
    <div class="card-body">
        <table class="table table-bordered table-hover">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Specialization</th>
                    <th>Experience</th>
                    <th>Department ID</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <% for(Doctor d : doctors){ %>
                    <tr>
                        <td><%= d.getDoctorId() %></td>
                        <td><%= d.getFullName() %></td>
                        <td><%= d.getEmail() %></td>
                        <td><%= d.getSpecialization() %></td>
                        <td><%= d.getExperience() %> yrs</td>
                        <td><%= d.getDeptId() %></td>
                        <td>
                            <a href="../deleteDoctor?id=<%= d.getDoctorId() %>"
                               class="btn btn-danger btn-sm"
                               onclick="return confirm('Are you sure?')">
                                Delete
                            </a>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</div>

<!-- Add Doctor Modal -->
<div class="modal fade" id="addDoctorModal">
    <div class="modal-dialog">
        <div class="modal-content">

            <form action="<%=request.getContextPath()%>/addDoctor" method="post">

                <div class="modal-header">
                    <h5 class="modal-title">Add New Doctor</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                </div>

                <div class="modal-body">

                    <div class="mb-3">
                        <label>Full Name</label>
                        <input type="text" name="fullName" class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label>Email</label>
                        <input type="email" name="email" class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label>Password</label>
                        <input type="text" name="password" class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label>Specialization</label>
                        <input type="text" name="specialization" class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label>Experience (Years)</label>
                        <input type="number" name="experience" class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label>Department ID</label>
                        <input type="number" name="deptId" class="form-control" required>
                    </div>

                </div>

                <div class="modal-footer">
                    <button type="submit" class="btn btn-success">
                        Add Doctor
                    </button>
                </div>

            </form>

        </div>
    </div>
</div>

<jsp:include page="../includes/footer.jsp"/>