<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="model.Doctor" %>

<%
Doctor doc = (Doctor) request.getAttribute("doctor");
%>

<jsp:include page="../includes/header.jsp">
    <jsp:param name="pageTitle" value="Edit Doctor"/>
</jsp:include>

<div class="container mt-4">

<h3>Edit Doctor</h3>

<form action="<%=request.getContextPath()%>/UpdateDoctorServlet" method="post">
    <input type="hidden" name="doctorId"
           value="<%=doc.getDoctorId()%>">

    <div class="mb-3">
        <label>Name</label>
        <input type="text" class="form-control"
               value="<%=doc.getFullName()%>" disabled>
    </div>

    <div class="mb-3">
        <label>Email</label>
        <input type="email" class="form-control"
               value="<%=doc.getEmail()%>" disabled>
    </div>

    <div class="mb-3">
        <label>Specialization</label>
        <input type="text" name="specialization"
               class="form-control"
               value="<%=doc.getSpecialization()%>">
    </div>

    <div class="mb-3">
        <label>Experience</label>
        <input type="number" name="experience"
               class="form-control"
               value="<%=doc.getExperience()%>">
    </div>

    <div class="mb-3">
        <label>Department ID</label>
        <input type="number" name="deptId"
               class="form-control"
               value="<%=doc.getDeptId()%>">
    </div>

    <button class="btn btn-success">Update Doctor</button>
</form>

</div>

<jsp:include page="../includes/footer.jsp"/>