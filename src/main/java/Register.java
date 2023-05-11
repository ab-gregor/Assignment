import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
public class Register extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
	
		String fName = req.getParameter("fName").toString();
		String lName = req.getParameter("lName").toString();
		String email = req.getParameter("email").toString();
		String password = req.getParameter("password").toString();
		
		
		req.setAttribute("fName", fName);
		req.setAttribute("lName", lName);
		req.setAttribute("email", email);
		req.setAttribute("password", password);
		
		//res.sendRedirect("pr?fName="+fName);
		RequestDispatcher rd = req.getRequestDispatcher("pr");
		rd.forward(req, res);
	}
}
