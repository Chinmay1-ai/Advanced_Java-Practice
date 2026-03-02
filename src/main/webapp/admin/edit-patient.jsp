<%@ page import="model.Patient" %>

<%
Patient p = (Patient) request.getAttribute("patient");
%>

<jsp:include page="../includes/header.jsp">
    <jsp:param name="pageTitle" value="Edit Patient"/>
</jsp:include>

<div class="container mt-4">

<h3>Edit Patient</h3>

<form action="<%=request.getContextPath()%>/UpdatePatientServlet"
      method="post">

<input type="hidden" name="patientId"
       value="<%=p.getPatientId()%>">

<div class="mb-3">
<label>Name</label>
<input type="text" class="form-control"
       value="<%=p.getFullName()%>" disabled>
</div>

<div class="mb-3">
<label>Email</label>
<input type="email" class="form-control"
       value="<%=p.getEmail()%>" disabled>
</div>

<div class="mb-3">
<label>Gender</label>
<input type="text" name="gender"
       class="form-control"
       value="<%=p.getGender()%>">
</div>

<div class="mb-3">
<label>DOB</label>
<input type="date" name="dob"
       class="form-control"
       value="<%=p.getDob()%>">
</div>

<div class="mb-3">
<label>Blood Group</label>
<input type="text" name="bloodGroup"
       class="form-control"
       value="<%=p.getBloodGroup()%>">
</div>

<div class="mb-3">
<label>Phone</label>
<input type="text" name="phone"
       class="form-control"
       value="<%=p.getPhone()%>">
</div>

<div class="mb-3">
<label>Address</label>
<textarea name="address"
          class="form-control"><%=p.getAddress()%></textarea>
</div>

<button class="btn btn-success">Update Patient</button>

</form>
</div>

<jsp:include page="../includes/footer.jsp"/>