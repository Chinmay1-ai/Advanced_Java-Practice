<%@ page import="java.util.*, model.Doctor, model.DoctorSlot"%>

<%
List<Doctor> doctorList = (List<Doctor>) request.getAttribute("doctorList");
List<DoctorSlot> slotList = (List<DoctorSlot>) request.getAttribute("slotList");

int patientId = Integer.parseInt(request.getAttribute("patientId").toString());

String selectedDoctor = request.getParameter("doctorId");
String selectedDate = request.getParameter("date");
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

				<!-- ================= LOAD FORM ================= -->
				<form action="<%=request.getContextPath()%>/loadBookAppointment"
					method="get">

					<input type="hidden" name="patientId" value="<%=patientId%>">

					<div class="mb-3">
						<label>Select Doctor</label> <select name="doctorId"
							class="form-select" onchange="this.form.submit()" required>

							<option value="">-- Select Doctor --</option>

							<%
							for (Doctor d : doctorList) {
							%>

							<option value="<%=d.getDoctorId()%>"
								<%=selectedDoctor != null && selectedDoctor.equals(String.valueOf(d.getDoctorId())) ? "selected" : ""%>>

								Dr.
								<%=d.getFullName()%> -
								<%=d.getSpecialization()%>

							</option>

							<%
							}
							%>

						</select>
					</div>

					<div class="mb-3">
						<label>Appointment Date</label> <input type="date" name="date"
							class="form-control"
							value="<%=selectedDate != null ? selectedDate : ""%>"
							onchange="this.form.submit()" required>
					</div>

				</form>

				<!-- ================= BOOK FORM ================= -->

				<form action="<%=request.getContextPath()%>/bookAppointment"
					method="post">

					<input type="hidden" name="patientId" value="<%=patientId%>">
					<input type="hidden" name="doctorId" value="<%=selectedDoctor%>">
					<input type="hidden" name="date" value="<%=selectedDate%>">

					<div class="mb-3">
						<label>Time Slot</label> <select name="slotId" class="form-select"
							required>

							<%
							if (slotList != null && !slotList.isEmpty()) {
								for (DoctorSlot s : slotList) {
							%>

							<option value="<%=s.getSlotId()%>">
								<%=s.getSlotTime()%>
							</option>

							<%
							}
							} else {
							%>

							<option value="">No Slots Available</option>

							<%
							}
							%>

						</select>
					</div>

					<button class="btn btn-success">Confirm Appointment</button>

					<a
						href="<%=request.getContextPath()%>/viewPatient?id=<%=patientId%>"
						class="btn btn-secondary">Cancel</a>

				</form>

			</div>
		</div>
	</div>

</body>
</html>