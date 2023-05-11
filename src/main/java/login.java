import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class login extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("Email: <input type=\"text\" name=\"n1\"></br>\r\n"
				+ "		password: <input type=\"password\" name=\"n2\"></br>"+
				"<input type='submit' name ='login'>");
	}
	}
