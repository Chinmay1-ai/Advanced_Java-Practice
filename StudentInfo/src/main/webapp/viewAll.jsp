<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
    <link rel="stylesheet" href="style.css">
</head>
<body class="form-body">

<div class="table-card">
    <h2>Student List</h2>

    <table class="student-table">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Action</th>
        </tr>

        <%
            List<Student> list =
                (List<Student>) request.getAttribute("studentList");

            if(list != null && !list.isEmpty()){

                for(Student s : list){
        %>

        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getAddress() %></td>
            <td>
                <a href="update?id=<%= s.getId() %>"
                   class="update-btn">Update</a>

                <a href="delete?id=<%= s.getId() %>"
                   class="delete-btn">Delete</a>
            </td>
        </tr>

        <%
                }
            } else {
        %>

        <tr>
            <td colspan="4">No Records Found</td>
        </tr>

        <%
            }
        %>

    </table>
</div>

</body>
</html>