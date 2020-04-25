package com.capg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	String id=request.getParameter("empId");
		String name=request.getParameter("empName");
		String salary=request.getParameter("empSalary");
		String address=request.getParameter("Address");
		String hno=request.getParameter("Hno");
		String area=request.getParameter("Area");
		String pincode=request.getParameter("Pincode");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();   		
		out.println("<html><h1><center>Emplyee Details </hr></center><body>");
		out.println("<p>Employee ID:</td>"+"<td>"+id+"</p>");
		out.println("<p>Employee Name:</td>"+"<td>"+name+"</p>");
		out.println("<p>Employee Salary:</td>"+"<td>"+salary+"</p>");
		out.println("<p>Address:</td>"+"<td>"+address+"</p>");
		out.println("<p>House Number:</td>"+"<td>"+hno+"</p");
		out.println("<p>Area:</td>"+"<td>"+area+"</td></p>");  
		out.println("<p>Pincode:</td>"+"<td>"+pincode+"</p>");
		out.println("</body></html>");
	    out.close();
	}
}
