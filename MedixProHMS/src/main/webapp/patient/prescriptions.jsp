<%@ page import="java.util.*, model.Prescription"%>

<!DOCTYPE html>
<html>
<head>
<title>My Prescriptions</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body class="bg-light">

	<div class="container mt-5">

		<h3 class="mb-4">My Prescriptions</h3>

		<%
		List<Prescription> list = (List<Prescription>) request.getAttribute("prescriptions");
		%>

		<div class="card shadow-sm">
			<div class="card-body">

				<table class="table table-bordered table-hover">

					<thead class="table-dark">
						<tr>
							<th>Doctor</th>
							<th>Medicines</th>
							<th>Notes</th>
						</tr>
					</thead>

					<tbody>

						<%
						if (list != null && !list.isEmpty()) {
							for (Prescription p : list) {
						%>

						<tr>
							<td><%=p.getDoctorName()%></td>
							<td><%=p.getMedicines()%></td>
							<td><%=p.getNotes()%></td>
						</tr>

						<%
						}
						} else {
						%>

						<tr>
							<td colspan="3" class="text-center">No prescriptions
								available</td>
						</tr>

						<%
						}
						%>

					</tbody>
				</table>

			</div>
		</div>

	</div>

</body>
</html>