
<%
int appointmentId = Integer.parseInt(request.getParameter("appointmentId"));
int patientId = Integer.parseInt(request.getParameter("patientId"));
int doctorId = (Integer) session.getAttribute("doctorId");
%>

<h3>Add Prescription</h3>

<form action="<%=request.getContextPath()%>/addPrescription"
	method="post">

	<input type="hidden" name="appointmentId" value="<%=appointmentId%>">
	<input type="hidden" name="patientId" value="<%=patientId%>"> <input
		type="hidden" name="doctorId" value="<%=doctorId%>"> <label>Medicines</label>
	<textarea name="medicines" required></textarea>

	<br>
	<br> <label>Doctor Notes</label>
	<textarea name="notes"></textarea>

	<br>
	<br>

	<button type="submit">Save Prescription</button>

</form>