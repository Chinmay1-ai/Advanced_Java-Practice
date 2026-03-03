<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>${pageTitle}</title>

    <!-- Bootstrap 5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/style.css">
</head>

<body>

<nav class="navbar navbar-dark bg-dark px-3">

    <span class="navbar-brand mb-0 h1">MedixPro HMS</span>

    <div>

        <%-- Show My Bills ONLY for PATIENT --%>
        <%
            String role = (String) session.getAttribute("userRole");
            if ("PATIENT".equals(role)) {
        %>
            <a class="btn btn-outline-light btn-sm me-2"
               href="<%=request.getContextPath()%>/viewBills">
               My Bills
            </a>
        <%
            }
        %>

        <a href="<%=request.getContextPath()%>/logout"
           class="btn btn-danger btn-sm">
           Logout
        </a>

    </div>

</nav>
<div class="container mt-4">