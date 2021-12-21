package com.loginpage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/servlet/xyz"})
public class LoginServlet extends HttpServlet {private static final long serialVersionUID = 1L;
public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException
{
	String u =request.getParameter("name");

	String uu = request.getParameter("job");
	int p= Integer.parseInt(request.getParameter("salary"));response.setContentType("text/html");

	PrintWriter out= response.getWriter();

	out.println("Your data is Stored on the database.<hr>"+u+uu+p);

	RequestDispatcher rd= request.getRequestDispatcher("index.html");
	rd.include(request, response);
	out.close();
	}
}