package employee;

import java.io.*;

import jakarta.servlet.*;

import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/form")

public class EmployeeDeta extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String address = req.getParameter("address");
			double salary = Double.parseDouble(req.getParameter("salary"));
			String gender = req.getParameter("gender");
			String profile = req.getParameter("profile");
			String[] hobby = req.getParameterValues("hobbies");
			pw.println("<h2>*** Employee Record ***</h2>");
			pw.println("<p><strong>Employee Id :</strong> " + id + "</p>");
			pw.println("<p><strong>Employee Name :</strong> " + name + "</p>");
			pw.println("<p><strong>Employee Address :</strong>" + address + "</p>");
			pw.println("<p><strong>Employee Salary:</strong> " + salary + "$</p>");
			pw.println("<p><strong>Employee Gender:</strong> : " +gender+"</p>");
			pw.println("<p><strong>Employee Profile:</strong> : " +profile+"</p>");
			pw.print("<p><strong>Employee Hobbies :</strong> : ");
			
			for (String hob : hobby) {
				pw.print(hob+" ");
			}
			
		} catch (Exception e) {
			pw.println("Enter Valid Input ...!");
		}
		
//		RequestDispatcher rd = req.getRequestDispatcher("EmployeeDetails.html");
//		rd.include(req, res);
	}

}
