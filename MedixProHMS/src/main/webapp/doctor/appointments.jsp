<%@ page import="java.util.List"%>
<%@ page import="model.Appointment"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<%
if (session.getAttribute("userRole") == null || !session.getAttribute("userRole").equals("DOCTOR")) {

	response.sendRedirect("../login.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<title>Appointment Requests</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body class="bg-light">

	<div class="container mt-5">

		<h3 class="mb-4">Appointment Requests</h3>

		<%
		List<Appointment> list = (List<Appointment>) request.getAttribute("appointments");
		%>

		<table class="table table-bordered table-hover shadow-sm">

			<thead class="table-dark">
				<tr>
					<th>Patient</th>
					<th>Date</th>
					<th>Time</th>
					<th>Status</th>
					<th width="280">Action</th>
				</tr>
			</thead>

			<tbody>

				<%
				if (list != null && !list.isEmpty()) {
					for (Appointment a : list) {
				%>

				<tr>
					<td><%=a.getPatientName()%></td>
					<td><%=a.getAppointmentDate()%></td>
					<td><%=a.getAppointmentTime()%></td>

					<td>
						<%
						String status = a.getStatus();

						if ("APPROVED".equals(status)) {
						%> <span class="badge bg-success">APPROVED</span> <%
 } else if ("REJECTED".equals(status)) {
 %> <span class="badge bg-danger">REJECTED</span> <%
 } else {
 %> <span class="badge bg-warning text-dark">PENDING</span> <%
 }
 %>
					</td>

					<td>
						<!-- APPROVE --> <a class="btn btn-success btn-sm"
						href="<%=request.getContextPath()%>/updateAppointmentStatus?id=<%=a.getAppointmentId()%>&status=APPROVED&doctorId=<%=session.getAttribute("doctorId")%>">
							Approve </a> <!-- REJECT --> <a class="btn btn-danger btn-sm"
						href="<%=request.getContextPath()%>/updateAppointmentStatus?id=<%=a.getAppointmentId()%>&status=REJECTED&doctorId=<%=session.getAttribute("doctorId")%>">
							Reject </a> <%
 if ("APPROVED".equals(status)) {
 %> <!-- ⭐ ADD PRESCRIPTION (FIXED) --> <a class="btn btn-primary btn-sm"
						href="<%=request.getContextPath()%>/doctor/add-prescription.jsp?appointmentId=<%=a.getAppointmentId()%>&patientId=<%=a.getPatientId()%>">
							Add Prescription </a> <%
 }
 %>

					</td>
				</tr>

				<%
				}
				} else {
				%>

				<tr>
					<td colspan="5" class="text-center">No appointment requests</td>
				</tr>

				<%
				}
				%>

			</tbody>
		</table>

	</div>

</body>
</html>