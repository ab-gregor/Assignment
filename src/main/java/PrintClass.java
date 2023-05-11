import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpServlet;

public class PrintClass extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String fName = req.getParameter("fName").toString();
		String lName = req.getParameter("lName").toString();
		String email = req.getParameter("email").toString();
		String password = req.getParameter("password").toString();
		
		PrintWriter pw=res.getWriter();
		
		pw.println("First Name"+fName);
		pw.println("Last name"+lName);
		pw.println("email"+email);
		pw.println("password"+password);
		
		
}
}