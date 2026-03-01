
<%
if (session.getAttribute("userRole") == null || !session.getAttribute("userRole").equals("DOCTOR")) {

	response.sendRedirect("../login.jsp");
	return;
}
%>

<%@ page contentType="text/html;charset=UTF-8"%>

<jsp:include page="../includes/header.jsp">
	<jsp:param name="pageTitle" value="Doctor Dashboard" />
</jsp:include>

<div class="container mt-4">

	<h3 class="mb-4">Doctor Dashboard</h3>

	<div class="row">

		<!-- Pending -->
		<div class="col-md-4">
			<div class="card shadow-sm border-warning">
				<div class="card-body text-center">
					<h5>Pending Requests</h5>
					<h2 class="text-warning">
						<%=request.getAttribute("pending")%>
					</h2>
				</div>
			</div>
		</div>

		<!-- Approved -->
		<div class="col-md-4">
			<div class="card shadow-sm border-success">
				<div class="card-body text-center">
					<h5>Approved Appointments</h5>
					<h2 class="text-success">
						<%=request.getAttribute("approved")%>
					</h2>
				</div>
			</div>
		</div>

		<!-- Rejected -->
		<div class="col-md-4">
			<div class="card shadow-sm border-danger">
				<div class="card-body text-center">
					<h5>Rejected Requests</h5>
					<h2 class="text-danger">
						<%=request.getAttribute("rejected")%>
					</h2>
				</div>
			</div>
		</div>

	</div>

	<!-- Button -->
	<div class="mt-4">
		<a class="btn btn-primary"
			href="<%=request.getContextPath()%>/doctorAppointments?doctorId=<%=session.getAttribute("doctorId")%>">
			View Appointment Requests </a>
	</div>

</div>

<jsp:include page="../includes/footer.jsp" />