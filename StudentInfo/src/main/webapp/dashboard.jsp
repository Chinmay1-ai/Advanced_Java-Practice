<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<div class="dashboard-layout">

    <!-- SIDEBAR -->
    <div class="sidebar">
        <div class="profile-section">
            <div class="profile-circle">
                ${sessionScope.userName.substring(0,2)}
            </div>
            <h3>${sessionScope.userName}</h3>
            <p>Administrator</p>
        </div>

        <ul class="menu">
            <li><a href="dashboard">Dashboard</a></li>
            <li><a href="register.html">Register Student</a></li>
            <li><a href="viewOptions.html">View Students</a></li>
            <li><a href="update.html">Update Student</a></li>
            <li><a href="delete.html">Delete Student</a></li>
        </ul>
    </div>

    <!-- MAIN CONTENT -->
    <div class="main-content">

        <!-- TOP BAR -->
        <div class="top-bar">
            <h2>Admin Dashboard</h2>

            <div class="profile-dropdown">
                <button class="profile-btn">
                    ${sessionScope.userName}
                </button>
                <div class="dropdown-content">
                    <a href="logout">Logout</a>
                </div>
            </div>
        </div>

        <!-- WELCOME CARD -->
        <div class="welcome-card">
            <h1>Welcome Back</h1>
            <p>
                This Student Management System allows you to manage 
                student records including registration, updates, viewing 
                and deletion.
            </p>
        </div>

        <!-- STATS -->
        <div class="stats-row">
            <div class="stat-box">
                <h3>150+</h3>
                <p>Total Students</p>
            </div>
            <div class="stat-box">
                <h3>5</h3>
                <p>Courses</p>
            </div>
            <div class="stat-box">
                <h3>24/7</h3>
                <p>System Active</p>
            </div>
        </div>

        <!-- QUICK ACTIONS -->
        <div class="card-grid">
            <a href="register.html" class="action-card">
                <h3>Register Student</h3>
                <p>Add new student records</p>
            </a>

            <a href="update.html" class="action-card">
                <h3>Update Student</h3>
                <p>Modify student details</p>
            </a>

            <a href="viewOptions.html" class="action-card">
                <h3>View Students</h3>
                <p>Check student information</p>
            </a>

            <a href="delete.html" class="action-card">
                <h3>Delete Student</h3>
                <p>Remove student records</p>
            </a>
        </div>

    </div>
</div>

</body>
</html>