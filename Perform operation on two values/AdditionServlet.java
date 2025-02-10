package test2;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;


@SuppressWarnings("serial")

@WebServlet("/add")
public class AdditionServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		try {
			int value1 =Integer.parseInt(req.getParameter("v1")); 

			int value2 =Integer.parseInt(req.getParameter("v2"));
			
			int value3 = value1 + value2;
			
			pw.println("Sum : "+value3);
			
			
		} catch (Exception e) {
			pw.println("Enter only integer value");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("PerformOperation.html");
		rd.include(req, res);
		
	}

	
}
