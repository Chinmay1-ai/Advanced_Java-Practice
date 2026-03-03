
<%
if (session.getAttribute("userRole") == null || !"PATIENT".equals(session.getAttribute("userRole"))) {
	response.sendRedirect("../login.jsp");
	return;
}
%>

<%@ page contentType="text/html;charset=UTF-8"%>

<jsp:include page="../includes/header.jsp">
	<jsp:param name="pageTitle" value="Patient Dashboard" />
</jsp:include>

<div class="container mt-4">

	<h3 class="mb-4">
		Welcome,
		<%=session.getAttribute("userName")%>
		👋
	</h3>

	<div class="row">

		<!-- BOOK APPOINTMENT -->
		<div class="col-md-4">
			<div class="card shadow-sm border-primary">
				<div class="card-body text-center">

					<h5>Book Appointment</h5>
					<p>Schedule a consultation with doctor</p>

					<a href="<%=request.getContextPath()%>/loadBookAppointment?patientId=<%=session.getAttribute("patientId")%>"
   class="btn btn-primary">
   Book Now
</a>

				</div>
			</div>
		</div>

		<!-- PRESCRIPTIONS -->
		<div class="col-md-4">
			<div class="card shadow-sm border-success">
				<div class="card-body text-center">

					<h5>My Prescriptions</h5>

					<a
						href="<%=request.getContextPath()%>/viewPatient?id=<%=session.getAttribute("patientId")%>#prescriptions"
						class="btn btn-success"> View </a>

				</div>
			</div>
		</div>

		<!-- BILLS -->
		<div class="col-md-4">
			<div class="card shadow-sm border-warning">
				<div class="card-body text-center">

					<h5>My Bills</h5>

					<a
						href="<%=request.getContextPath()%>/viewPatient?id=<%=session.getAttribute("patientId")%>#bills"
						class="btn btn-warning text-dark"> Open Bills </a>

				</div>
			</div>
		</div>

	</div>
</div>

<jsp:include page="../includes/footer.jsp" />