package test2;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;


@SuppressWarnings("serial")

@WebServlet("/mul")
public class MultiplicationServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		try {
			int value1 =Integer.parseInt(req.getParameter("v1")); 

			int value2 =Integer.parseInt(req.getParameter("v2"));
			
			float value3 =(float) value1 * value2;
			
			pw.println("Multiplication : "+value3);
			
			
		} catch (Exception e) {
			pw.println("Enter only integer value");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("PerformOperation.html");
		rd.include(req, res);
		
	}

	
}
