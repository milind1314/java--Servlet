package operations;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/arm")
public class Armstrong extends GenericServlet {
    
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        
        try {
            int arm = Integer.parseInt(req.getParameter("value")); 
            
            int num = arm, count = 0, sum = 0;
            
            // Count the number of digits
            int temp = num;
            while (temp != 0) {
                temp /= 10;
                count++;
            }

            // Calculate the Armstrong sum
            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }
            
            // Check if it's an Armstrong number
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<style>");
            pw.println("body { font-family: Arial, sans-serif; text-align: center; background-color: #f4f4f4; }");
            pw.println("p { font-size: 20px; color: #333; }");
            pw.println(".armstrong { color: blue; font-weight: bold; }");
            pw.println(".not-armstrong { color: orange; font-weight: bold; }");
            pw.println("</style>");
            pw.println("</head>");
            pw.println("<body>");

            pw.println("<div style='clear: both; margin-top: 20px;'>");
            if (sum == arm) {
                pw.println("<p class='armstrong'>" + arm + " is an Armstrong number.</p>");
            } else {
                pw.println("<p class='not-armstrong'>" + arm + " is not an Armstrong number.</p>");
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
