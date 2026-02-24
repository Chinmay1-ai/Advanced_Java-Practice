import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Demo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("f_name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(dob);

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h2>Registration Successful</h2>");
		out.println("Name: " + firstName + "<br>");
		out.println("Email: " + email + "<br>");
		out.println("Gender: " + gender + "<br>");
		out.println("DOB: " + dob + "<br>");
		out.println("</body></html>");

	}

}