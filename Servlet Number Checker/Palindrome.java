package operations;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/pali")

public class Palindrome extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		try {
			int p = Integer.parseInt(req.getParameter("value"));
			
			int r,sum = 0;
			
			int og = p;
			
			while (p!=0) {
				r = p % 10;
				sum = sum * 10 + r;
				p=p/10;
			}
			
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<style>");
			pw.println("body { font-family: Arial, sans-serif; text-align: center; background-color: #f4f4f4; }");
			pw.println("p { font-size: 20px; color: #333; }");
			pw.println(".palindrome { color: green; font-weight: bold; }");
			pw.println(".not-palindrome { color: red; font-weight: bold; }");
			pw.println("</style>");
			pw.println("</head>");
			pw.println("<body>");

			pw.println("<div style='clear: both; margin-top: 20px;'>");
			if (sum == og) {
			    pw.println("<p class='palindrome'>" + og + " is a Palindrome number.</p>");
			} else {
			    pw.println("<p class='not-palindrome'>" + og + " is not a Palindrome number.</p>");
			}

			pw.println("</body>");
			pw.println("</html>");

		} 
		catch (NumberFormatException e) 
        {
			pw.println("<div style='clear: both; margin-top: 20px;'>");

        	pw.println("<div style='color: red; font-weight: bold; margin-top: 10px; text-align: center;'>");
            pw.println("Enter only integer value");
            pw.println("</div>");        
        }
		RequestDispatcher rd = req.getRequestDispatcher("input.html");
		rd.include(req, res);
		
	}

}
