<%@ page import="java.util.List"%>
<%@ page import="model.Doctor"%>

<%
List<Doctor> doctorList = (List<Doctor>) request.getAttribute("doctorList");

int patientId = Integer.parseInt(request.getAttribute("patientId").toString());
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Appointment</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body class="bg-light">

	<div class="container mt-5">

		<div class="card shadow">

			<div class="card-header bg-dark text-white">
				<h4>Book Appointment</h4>
			</div>

			<div class="card-body">

				<form action="<%=request.getContextPath()%>/bookAppointment"
					method="post">

					<!-- PATIENT ID -->
					<input type="hidden" name="patientId" value="<%=patientId%>">

					<!-- DOCTOR SELECT -->
					<div class="mb-3">
						<label class="form-label">Select Doctor</label> <select
							name="doctorId" class="form-select" required>

							<option value="">-- Select Doctor --</option>

							<%
							if (doctorList != null) {
								for (Doctor d : doctorList) {
							%>

							<option value="<%=d.getDoctorId()%>">Dr.
								<%=d.getFullName()%> -
								<%=d.getSpecialization()%>
							</option>

							<%
							}
							}
							%>

						</select>
					</div>

					<!-- DATE -->
					<div class="mb-3">
						<label class="form-label">Appointment Date</label> <input
							type="date" name="date" class="form-control" required>
					</div>

					<!-- TIME -->
					<div class="mb-3">
						<label class="form-label">Appointment Time</label> <input
							type="time" name="time" class="form-control" required>
					</div>

					<!-- BUTTONS -->
					<button class="btn btn-success">Confirm Appointment</button>

					<a
						href="<%=request.getContextPath()%>/viewPatient?id=<%=patientId%>"
						class="btn btn-secondary"> Cancel </a>

				</form>

			</div>
		</div>

	</div>

</body>
</html>