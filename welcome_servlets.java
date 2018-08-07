

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class welcome_servlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw= response.getWriter();
		
		pw.println("<html><body>");
		pw.println("<h4>hello welcome to servlets!!</h4>");
		pw.println("</body></html>");
		
	}
}

