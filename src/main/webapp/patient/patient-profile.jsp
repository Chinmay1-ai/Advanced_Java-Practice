<%@ page
	import="model.Patient, model.Appointment, model.Prescription, model.Bill, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String role = (String) session.getAttribute("userRole");

Patient p = (Patient) request.getAttribute("patient");
List<Appointment> appointments = (List<Appointment>) request.getAttribute("appointments");

List<Prescription> prescriptions = (List<Prescription>) request.getAttribute("prescriptions");

List<Bill> bills = (List<Bill>) request.getAttribute("bills");
%>

<jsp:include page="../includes/header.jsp">
	<jsp:param name="pageTitle" value="Patient Profile" />
</jsp:include>

<div class="card shadow-sm p-4">

	<div class="d-flex justify-content-between">
		<h3>Patient Profile</h3>

		<%
		String backUrl;

		if ("ADMIN".equals(role)) {
			backUrl = request.getContextPath() + "/admin/manage-patient.jsp";
		} else {
			backUrl = request.getContextPath() + "/patient/dashboard.jsp";
		}
		%>

		<a href="<%=backUrl%>" class="btn btn-secondary">← Back</a>
	</div>

	<hr>

	<!-- PROFILE -->
	<div class="row">

		<div class="col-md-4 text-center">
			<img src="<%=request.getContextPath()%>/assets/images/user.png"
				width="140" class="rounded-circle mb-3">

			<h4><%=p.getFullName()%></h4>
			<span class="badge bg-primary"><%=p.getBloodGroup()%></span>
		</div>

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
					<th>DOB</th>
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

	<ul class="nav nav-tabs">

		<li class="nav-item"><a class="nav-link active"
			data-bs-toggle="tab" href="#appointments"> Appointments </a></li>

		<%
		if ("PATIENT".equals(role) || "ADMIN".equals(role)) {
		%>

		<li class="nav-item"><a class="nav-link" data-bs-toggle="tab"
			href="#prescriptions"> Prescriptions </a></li>

		<li class="nav-item"><a class="nav-link" data-bs-toggle="tab"
			href="#bills"> Bills </a></li>

		<%
		}
		%>

	</ul>

	<div class="tab-content mt-3">

		<!-- ================= APPOINTMENTS ================= -->
		<div class="tab-pane fade show active" id="appointments">

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
						<td><span class="badge bg-success"><%=a.getStatus()%></span>
						</td>
					</tr>

					<%
					}
					} else {
					%>
					<tr>
						<td colspan="3">No appointments found</td>
					</tr>
					<%
					}
					%>

				</tbody>
			</table>

			<%
			if ("PATIENT".equals(role)) {
			%>
			<a href="<%=request.getContextPath()%>/loadBookAppointment?patientId=<%=p.getPatientId()%>"
   class="btn btn-primary">
   + Book Appointment
</a>
			<%
			}
			%>

		</div>

		<!-- ================= PRESCRIPTIONS ================= -->
		<div class="tab-pane fade" id="prescriptions">

			<table class="table table-bordered">
				<tr>
					<th>Medicines</th>
					<th>Notes</th>
				</tr>

				<%
				if (prescriptions != null && !prescriptions.isEmpty()) {
					for (Prescription pr : prescriptions) {
				%>
				<tr>
					<td><%=pr.getMedicines()%></td>
					<td><%=pr.getNotes()%></td>
				</tr>
				<%
				}
				} else {
				%>
				<tr>
					<td colspan="2">No prescriptions found</td>
				</tr>
				<%
				}
				%>

			</table>

		</div>

		<!-- ================= BILLS ================= -->
		<div class="tab-pane fade" id="bills">

			<table class="table table-bordered">
				<tr>
					<th>Bill ID</th>
					<th>Amount</th>
					<th>Status</th>
				</tr>

				<%
				if (bills != null && !bills.isEmpty()) {
					for (Bill b : bills) {
				%>

				<tr>
					<td><%=b.getBillId()%></td>
					<td>₹ <%=b.getTotalAmount()%></td>

					<td>
						<%
						if ("PAID".equals(b.getStatus())) {
						%> <span class="badge bg-success">PAID</span> <%
 } else {
 %> <span class="badge bg-warning text-dark">UNPAID</span> <%
 if ("PATIENT".equals(role)) {
 %> <a
						href="<%=request.getContextPath()%>/payBill?billId=<%=b.getBillId()%>"
						class="btn btn-sm btn-success ms-2"> Pay Now </a> <%
 }
 %> <%
 }
 %>

					</td>
				</tr>

				<%
				}
				} else {
				%>
				<tr>
					<td colspan="3">No bills found</td>
				</tr>
				<%
				}
				%>

			</table>

		</div>

	</div>
</div>

<jsp:include page="../includes/footer.jsp" />