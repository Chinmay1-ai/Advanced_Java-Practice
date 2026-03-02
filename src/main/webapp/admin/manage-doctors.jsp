<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page
	import="java.util.*, dao.DoctorDAO, dao.DepartmentDAO, model.Doctor, model.Department"%>

<%
/* ===============================
   ADMIN SESSION CHECK (SAFE)
================================ */
String role = (String) session.getAttribute("userRole");

if (role == null || !"ADMIN".equals(role)) {
	response.sendRedirect("../login.jsp");
	return;
}

/* ===============================
   LOAD DATA
================================ */
List<Doctor> doctors = DoctorDAO.getAllDoctors();
List<Department> departments = DepartmentDAO.getAllDepartments();
%>

<jsp:include page="../includes/header.jsp">
	<jsp:param name="pageTitle" value="Manage Doctors" />
</jsp:include>

<div class="container mt-4">

	<!-- Header -->
	<div class="d-flex justify-content-between align-items-center mb-3">
		<h3>Manage Doctors</h3>

		<button class="btn btn-primary" data-bs-toggle="modal"
			data-bs-target="#addDoctorModal">+ Add Doctor</button>
	</div>

	<!-- SUCCESS ALERT -->
	<%
	if (request.getParameter("success") != null) {
	%>
	<div class="alert alert-success">
		<%=request.getParameter("success")%>
	</div>
	<%
	}
	%>

	<!-- ERROR ALERT -->
	<%
	if (request.getParameter("error") != null) {
	%>
	<div class="alert alert-danger">
		<%=request.getParameter("error")%>
	</div>
	<%
	}
	%>

	<!-- ===============================
         DOCTORS TABLE
    ================================= -->
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
						<th>Department</th>
						<th width="150">Action</th>
					</tr>
				</thead>

				<tbody>

					<%
					if (doctors != null && !doctors.isEmpty()) {
						for (Doctor d : doctors) {
					%>

					<tr>
						<td><%=d.getDoctorId()%></td>

						<td><%=d.getFullName()%></td>

						<!-- NULL SAFE EMAIL -->
						<td><%=d.getEmail() != null ? d.getEmail() : "-"%></td>

						<td><%=d.getSpecialization()%></td>

						<!-- EXPERIENCE SAFE -->
						<td><%=d.getExperience() > 0 ? d.getExperience() + " yrs" : "-"%></td>

						<!-- NULL SAFE DEPARTMENT -->
						<td><%=d.getDepartmentName() != null ? d.getDepartmentName() : "-"%></td>

						<td>
							<!-- EDIT --> <a
							href="<%=request.getContextPath()%>/EditDoctorServlet?id=<%=d.getDoctorId()%>"
							class="btn btn-warning btn-sm"> Edit </a> <!-- DELETE --> <a
							href="<%=request.getContextPath()%>/deleteDoctor?id=<%=d.getDoctorId()%>"
							class="btn btn-danger btn-sm"
							onclick="return confirm('Delete this doctor?')"> Delete </a>

						</td>
					</tr>

					<%
					}
					} else {
					%>

					<tr>
						<td colspan="7" class="text-center text-muted">No Doctors
							Found</td>
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
        ADD DOCTOR MODAL
====================================== -->
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
						<label>Full Name</label> <input type="text" name="fullName"
							class="form-control" required>
					</div>

					<div class="mb-3">
						<label>Email</label> <input type="email" name="email"
							class="form-control" required>
					</div>

					<div class="mb-3">
						<label>Password</label> <input type="text" name="password"
							class="form-control" required>
					</div>

					<div class="mb-3">
						<label>Specialization</label> <input type="text"
							name="specialization" class="form-control" required>
					</div>

					<div class="mb-3">
						<label>Experience (Years)</label> <input type="number"
							name="experience" class="form-control" required>
					</div>

					<!-- Department Dropdown -->
					<div class="mb-3">
						<label>Department</label> <select name="deptId"
							class="form-select" required>

							<option value="">Select Department</option>

							<%
							if (departments != null) {
								for (Department dep : departments) {
							%>

							<option value="<%=dep.getDeptId()%>">
								<%=dep.getDeptName()%>
							</option>

							<%
							}
							}
							%>

						</select>
					</div>

				</div>

				<div class="modal-footer">
					<button type="submit" class="btn btn-success">Add Doctor</button>
				</div>

			</form>

		</div>
	</div>
</div>


<jsp:include page="../includes/footer.jsp" />