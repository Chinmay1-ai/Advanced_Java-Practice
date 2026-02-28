<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Register - MedixPro HMS</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="bg-light">

<div class="container mt-5">
<div class="card shadow col-md-6 mx-auto">

<div class="card-body">

<h3 class="text-center mb-4">Create Account</h3>

<form action="registerUser" method="post">

<div class="mb-3">
<label>Register As</label>
<select name="role" class="form-select" required>
<option value="">Select Role</option>
<option value="ADMIN">Admin</option>
<option value="DOCTOR">Doctor</option>
<option value="PATIENT">Patient</option>
</select>
</div>

<div class="mb-3">
<label>Full Name</label>
<input type="text" name="fullName" class="form-control" required>
</div>

<div class="mb-3">
<label>Email</label>
<input type="email" name="email" class="form-control" required>
</div>

<div class="mb-3">
<label>Password</label>
<input type="password" name="password" class="form-control" required>
</div>

<button class="btn btn-success w-100">
Register
</button>

</form>

<div class="text-center mt-3">
<a href="login.jsp">Already have account?</a>
</div>

</div>
</div>
</div>

</body>
</html>