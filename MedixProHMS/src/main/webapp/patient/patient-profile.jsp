<%@ page import="model.Patient, java.util.*, model.Appointment" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
Patient p = (Patient) request.getAttribute("patient");
List<Appointment> appointments =
        (List<Appointment>) request.getAttribute("appointments");
%>

<jsp:include page="../includes/header.jsp">
    <jsp:param name="pageTitle" value="Patient Profile"/>
</jsp:include>

<div class="card shadow-sm p-4">

    <div class="d-flex justify-content-between">
        <h3>Patient Profile</h3>

        <a href="<%=request.getContextPath()%>/admin/manage-patient.jsp"
           class="btn btn-secondary">← Back</a>
    </div>

    <hr>

    <!-- PROFILE SECTION -->
    <div class="row">

        <!-- LEFT -->
        <div class="col-md-4 text-center">

            <!-- FIXED IMAGE -->
            <img src="<%=request.getContextPath()%>/assets/images/user.png"
                 width="140"
                 class="rounded-circle mb-3">

            <h4><%=p.getFullName()%></h4>

            <span class="badge bg-primary">
                <%=p.getBloodGroup()%>
            </span>
        </div>

        <!-- RIGHT -->
        <div class="col-md-8">

            <table class="table table-bordered">
                <tr>
                    <th>Email</th>
                    <td><%=p.getEmail()%></td>
                </tr>

                <tr>
                    <th>Gender</th>
                    <td><%=p.getGender()%></td>
                </tr>

                <tr>
                    <th>Date of Birth</th>
                    <td><%=p.getDob()%></td>
                </tr>

                <tr>
                    <th>Phone</th>
                    <td><%=p.getPhone()%></td>
                </tr>

                <tr>
                    <th>Address</th>
                    <td><%=p.getAddress()%></td>
                </tr>
            </table>

        </div>
    </div>

    <!-- ================= TABS ================= -->

    <ul class="nav nav-tabs mt-4" id="profileTabs">

        <li class="nav-item">
            <button class="nav-link active"
                    data-bs-toggle="tab"
                    data-bs-target="#appointments">
                Appointments
            </button>
        </li>

        <li class="nav-item">
            <button class="nav-link"
                    data-bs-toggle="tab"
                    data-bs-target="#prescriptions">
                Prescriptions
            </button>
        </li>

        <li class="nav-item">
            <button class="nav-link"
                    data-bs-toggle="tab"
                    data-bs-target="#bills">
                Bills
            </button>
        </li>

    </ul>

    <div class="tab-content mt-3">

        <!-- ================= APPOINTMENTS ================= -->
        <div class="tab-pane fade show active" id="appointments">

            <h5>Appointment History</h5>

            <table class="table table-bordered">
                <thead class="table-dark">
                <tr>
                    <th>Date</th>
                    <th>Doctor</th>
                    <th>Status</th>
                </tr>
                </thead>

                <tbody>

                <%
                if (appointments != null && !appointments.isEmpty()) {
                    for (Appointment a : appointments) {
                %>

                <tr>
                    <td><%=a.getAppointmentDate()%></td>
                    <td><%=a.getDoctorName()%></td>
                    <td>
<%
String status = a.getStatus();

if("APPROVED".equals(status)){
%>
    <span class="badge bg-success">APPROVED</span>
<%
}else if("REJECTED".equals(status)){
%>
    <span class="badge bg-danger">REJECTED</span>
<%
}else{
%>
    <span class="badge bg-warning text-dark">PENDING</span>
<%
}
%>
</td>
                </tr>

                <%
                    }
                } else {
                %>

                <tr>
                    <td colspan="3" class="text-center">
                        No appointments available
                    </td>
                </tr>

                <% } %>

                </tbody>
            </table>

            <a href="<%=request.getContextPath()%>/loadBookAppointment?patientId=<%=p.getPatientId()%>"
   class="btn btn-primary">
   + Book Appointment
</a>

        </div>

        <!-- ================= PRESCRIPTIONS ================= -->
        <div class="tab-pane fade" id="prescriptions">

            <div class="alert alert-info">
                Prescriptions module coming next ✔
            </div>

        </div>

        <!-- ================= BILLS ================= -->
        <div class="tab-pane fade" id="bills">

            <div class="alert alert-info">
                Billing system coming next ✔
            </div>

        </div>

    </div>

</div>

<jsp:include page="../includes/footer.jsp"/>