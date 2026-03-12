import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String email = request.getParameter("email");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			PreparedStatement ps = c.prepareStatement("select * from institute where email=?");

			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

			    out.println("<html>");
			    out.println("<head>");
			    out.println("<title>Student Details</title>");
			    out.println("<link rel='stylesheet' href='style.css'>");
			    out.println("</head>");
			    out.println("<body class='view-wrapper'>");

			    out.println("<div class='view-card'>");
			    out.println("<h2>Student Details</h2>");
			    out.println("<table class='view-table'>");

			    out.println("<tr><td>Name:</td><td>" + rs.getString("name") + "</td></tr>");
			    out.println("<tr><td>Email:</td><td>" + rs.getString("email") + "</td></tr>");
			    out.println("<tr><td>Mobile:</td><td>" + rs.getString("mobNo") + "</td></tr>");
			    out.println("<tr><td>Gender:</td><td>" + rs.getString("gender") + "</td></tr>");
			    out.println("<tr><td>Course:</td><td>" + rs.getString("course") + "</td></tr>");
			    out.println("<tr><td>Address:</td><td>" + rs.getString("address") + "</td></tr>");

			    out.println("</table>");

			    out.println("<div class='back-link'>");
			    out.println("<a href='index.html'>Back to Home</a>");
			    out.println("</div>");

			    out.println("</div>");
			    out.println("</body>");
			    out.println("</html>");

			} else {
			    out.println("<h3>No Record Found</h3>");
			}

			c.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}