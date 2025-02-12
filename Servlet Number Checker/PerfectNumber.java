package operations;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/perfect")

public class PerfectNumber extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		try {
			
			int v = Integer.parseInt(req.getParameter("value"));
			int sum = 0;
			for (int i = 1; i <= v/2; i++) {
				if (v % i == 0) {
					sum += i;
				}
			}
			
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<style>");
			pw.println("body { font-family: Arial, sans-serif; text-align: center; background-color: #f4f4f4; }");
			pw.println("p { font-size: 20px; color: #333; }");
			pw.println(".perfect { color: purple; font-weight: bold; }");
			pw.println(".not-perfect { color: brown; font-weight: bold; }");
			pw.println("</style>");
			pw.println("</head>");
			pw.println("<body>");

			
			pw.println("<div style='clear: both; margin-top: 20px;'>");
			if (v == sum) {
			    pw.println("<p class='perfect'>" + v + " is a Perfect number.</p>");
			} else {
			    pw.println("<p class='not-perfect'>" + v + " is not a Perfect number.</p>");
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
