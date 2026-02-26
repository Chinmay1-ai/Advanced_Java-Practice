<%
    if(session.getAttribute("userRole") == null || 
       !session.getAttribute("userRole").equals("ADMIN")) {
        response.sendRedirect("../login.jsp");
        return;
    }
%>
<%@ page contentType="text/html;charset=UTF-8" %>

<jsp:include page="../includes/header.jsp">
    <jsp:param name="pageTitle" value="Admin Dashboard"/>
</jsp:include>

<div class="container mt-4">
    <h2>Admin Dashboard</h2>
</div>

<jsp:include page="../includes/footer.jsp"/>