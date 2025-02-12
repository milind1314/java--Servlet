package operations;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/cal")

public class Choice extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		String sb = req.getParameter("in");
		
		if (sb.equals("Prime")) {
			
			RequestDispatcher rd = req.getRequestDispatcher("prime");
			rd.forward(req, res);
		}
		else if (sb.equals("Palindrome number")) {
			RequestDispatcher rd = req.getRequestDispatcher("pali");
			rd.forward(req, res);
		}
		else if (sb.equals("Armstrong number")) {
			RequestDispatcher rd = req.getRequestDispatcher("arm");
			rd.forward(req, res);
		}
		else if (sb.equals("Perfect number")){
			RequestDispatcher rd = req.getRequestDispatcher("perfect");
			rd.forward(req, res);
		}
	}

}
