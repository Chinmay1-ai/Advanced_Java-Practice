<%@ page import="model.Patient" %>

<%
Patient p = (Patient) request.getAttribute("patient");

if (p == null) {
    response.sendRedirect("../admin/manage-patient.jsp");
    return;
}
%>

<jsp:include page="../includes/header.jsp">
    <jsp:param name="pageTitle" value="Patient Profile"/>
</jsp:include>

<div class="container mt-4">

    <div class="card shadow-lg">
        <div class="card-body">

            <div class="d-flex justify-content-between align-items-center">
                <h3>Patient Profile</h3>

<a href="<%=request.getContextPath()%>/admin/manage-patient.jsp"
   class="btn btn-secondary">
   ← Back
</a>            </div>

            <hr>

            <div class="row">

                <!-- LEFT SIDE -->
                <div class="col-md-4 text-center">
                    <img src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
                         width="150"
                         class="mb-3">

                    <h4><%=p.getFullName()%></h4>
                    <span class="badge bg-primary">
                        <%=p.getBloodGroup()%>
                    </span>
                </div>

                <!-- RIGHT SIDE -->
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

        </div>
    </div>

</div>

<jsp:include page="../includes/footer.jsp"/>