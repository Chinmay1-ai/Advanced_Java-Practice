import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String email = request.getParameter("email");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			PreparedStatement ps = c.prepareStatement("delete from institute where email=?");

			ps.setString(1, email);

			int rows = ps.executeUpdate();

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Delete Result</title>");
			out.println("<link rel='stylesheet' href='style.css'>");
			out.println("</head>");
			out.println("<body class='result-wrapper'>");

			out.println("<div class='result-card'>");

			if (rows > 0) {
				out.println("<h2 class='success'>Record Deleted Successfully!</h2>");
				out.println("<p>The student record has been permanently removed from the system.</p>");
			} else {
				out.println("<h2 class='error'>No Record Found</h2>");
				out.println("<p>No student exists with the provided email address.</p>");
			}

			out.println("<a href='index.html'>Back to Home</a>");

			out.println("</div>");
			out.println("</body>");
			out.println("</html>");

			c.close();

		} catch (Exception e) {
			out.println("Error: " + e.getMessage());
		}
	}
}