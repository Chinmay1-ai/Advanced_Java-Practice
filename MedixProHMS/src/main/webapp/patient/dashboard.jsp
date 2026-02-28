<%
    if(session.getAttribute("userRole") == null || 
       !session.getAttribute("userRole").equals("PATIENT")) {
        response.sendRedirect("../login.jsp");
        return;
    }
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>