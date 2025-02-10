package test2;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")

@WebServlet("/opration")

public class PerformOperationOnTwoValues extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String sb = req.getParameter("op");
		
		if (sb.equals("Subtraction")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("sub");
			
			rd.forward(req, res);
		}
		else if (sb.equals("Addition")) {

			RequestDispatcher rd = req.getRequestDispatcher("add");
			
			rd.forward(req, res);
		}
		else if (sb.equals("Multiplication")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("mul");
			
			rd.forward(req, res);
		}
		else if (sb.equals("Division")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("div");
			
			rd.forward(req, res);
		}
		else if (sb.equals("Mod Division")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("mod");
			
			rd.forward(req, res);
		}
		else if (sb.equals("Greater value")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("grt");
			
			rd.forward(req, res);
		}
		else if (sb.equals("Smaller value")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("slr");
			
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("avg");
			
			rd.forward(req, res);
		}
		
		
	}

	
}
