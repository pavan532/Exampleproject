package com.nit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/frist")
public class fristApplication extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {
		
		  response.setContentType("text/html");  
		    PrintWriter out = response.getWriter(); 
		    
		    String n=request.getParameter("name");  
		    String p=request.getParameter("num"); 
		    
		    out.println("<h1 style='text-align: center;color :blue;'>hello :"+n+"<br>");
		    out.println("<h1 style='text-align: center;color :blue;'>your Password  :"+p);
	}
}
