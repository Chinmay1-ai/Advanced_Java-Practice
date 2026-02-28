<%@ page import="java.util.*, dao.PatientDAO, model.Patient"%>

<%
/* ===============================
   ADMIN SESSION SECURITY
=================================*/
if (session.getAttribute("userRole") == null ||
    !session.getAttribute("userRole").equals("ADMIN")) {

    response.sendRedirect("../login.jsp");
    return;
}

/* ===============================
   FETCH PATIENTS
=================================*/
List<Patient> patients = PatientDAO.getAllPatients();
%>

<jsp:include page="../includes/header.jsp">
    <jsp:param name="pageTitle" value="Manage Patients"/>
</jsp:include>

<div class="container mt-4">

    <!-- Page Header -->
    <div class="d-flex justify-content-between align-items-center mb-3">
        <h3>Manage Patients</h3>

        <button class="btn btn-primary"
            data-bs-toggle="modal"
            data-bs-target="#addPatientModal">

            + Add Patient
        </button>
    </div>

    <!-- SUCCESS ALERT -->
    <%
    if(request.getParameter("success") != null){
    %>
        <div class="alert alert-success">
            <%=request.getParameter("success")%>
        </div>
    <%
    }
    %>

    <!-- ERROR ALERT -->
    <%
    if(request.getParameter("error") != null){
    %>
        <div class="alert alert-danger">
            <%=request.getParameter("error")%>
        </div>
    <%
    }
    %>

    <!-- ===============================
         PATIENT TABLE
    ==================================-->
    <input type="text" class="form-control"
       placeholder="Search patient by name or email">
    <div class="card shadow-sm">
        <div class="card-body">

            <table class="table table-bordered table-hover">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>DOB</th>
                        <th>Blood Group</th>
                        <th>Phone</th>
                        <th>Action</th>
                    </tr>
                </thead>

                <tbody>

                <%
                for(Patient p : patients){
                %>

                    <tr>
                        <td><%=p.getPatientId()%></td>
                        <td><%=p.getFullName()%></td>
                        <td><%=p.getEmail()%></td>
                        <td><%=p.getGender()%></td>
                        <td><%=p.getDob()%></td>
                        <td><%=p.getBloodGroup()%></td>
                        <td><%=p.getPhone()%></td>

                        <td>

                        <a href="<%=request.getContextPath()%>/EditPatientServlet?id=<%=p.getPatientId()%>"
                        class="btn btn-warning btn-sm">
                        Edit
                        </a>

                        <a href="<%=request.getContextPath()%>/deletePatient?id=<%=p.getPatientId()%>"
   class="btn btn-danger btn-sm"
   onclick="return confirm('Are you sure you want to delete this patient?')">
   Delete
</a>
                        
                        <a href="<%=request.getContextPath()%>/viewPatient?id=<%=p.getPatientId()%>"
   class="btn btn-info btn-sm">
   View
</a>

                        </td>
                    </tr>

                <%
                }
                %>

                </tbody>
            </table>

        </div>
    </div>

</div>

<!-- ======================================
        ADD PATIENT MODAL
=======================================-->
<div class="modal fade" id="addPatientModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">

            <form action="<%=request.getContextPath()%>/addPatient"
                  method="post">

                <div class="modal-header">
                    <h5 class="modal-title">Add New Patient</h5>
                    <button class="btn-close"
                            data-bs-dismiss="modal"></button>
                </div>

                <div class="modal-body">

                    <div class="row">

                        <div class="col-md-6 mb-3">
                            <label>Full Name</label>
                            <input type="text" name="fullName"
                                   class="form-control" required>
                        </div>

                        <div class="col-md-6 mb-3">
                            <label>Email</label>
                            <input type="email" name="email"
                                   class="form-control" required>
                        </div>

                        <div class="col-md-6 mb-3">
                            <label>Password</label>
                            <input type="text" name="password"
                                   class="form-control" required>
                        </div>

                        <div class="col-md-6 mb-3">
                            <label>Gender</label>
                            <select name="gender"
                                    class="form-select" required>
                                <option value="">Select</option>
                                <option>Male</option>
                                <option>Female</option>
                                <option>Other</option>
                            </select>
                        </div>

                        <div class="col-md-6 mb-3">
                            <label>Date of Birth</label>
                            <input type="date" name="dob"
                                   class="form-control" required>
                        </div>

                        <div class="col-md-6 mb-3">
                            <label>Blood Group</label>
                            <input type="text" name="bloodGroup"
                                   class="form-control"
                                   placeholder="O+, A+, B+">
                        </div>

                        <div class="col-md-6 mb-3">
                            <label>Phone</label>
                            <input type="text" name="phone"
                                   class="form-control">
                        </div>

                        <div class="col-md-12 mb-3">
                            <label>Address</label>
                            <textarea name="address"
                                      class="form-control"
                                      rows="2"></textarea>
                        </div>

                    </div>

                </div>

                <div class="modal-footer">
                    <button class="btn btn-success">
                        Add Patient
                    </button>
                </div>

            </form>

        </div>
    </div>
</div>

<jsp:include page="../includes/footer.jsp"/>