<%
    if(session.getAttribute("userRole") == null || 
       !session.getAttribute("userRole").equals("ADMIN")) {
        response.sendRedirect("../login.jsp");
        return;
    }
%>
<%@ page contentType="text/html;charset=UTF-8" %>

<jsp:include page="../includes/header.jsp">
    <jsp:param name="pageTitle" value="Admin Dashboard"/>
</jsp:include>

<div class="container mt-4">
    <h2>Admin Dashboard</h2>
</div>

<div class="row mt-4">

    <div class="col-md-3">
        <a href="manage-doctors.jsp" class="btn btn-primary w-100">
            Manage Doctors
        </a>
    </div>

    <div class="col-md-3">
        <a href="manage-patient.jsp" class="btn btn-success w-100">
            Manage Patients
        </a>
    </div>

    <div class="col-md-3">
        <a href="manage-departments.jsp" class="btn btn-warning w-100">
            Departments
        </a>
    </div>

</div>

<jsp:include page="../includes/footer.jsp"/>