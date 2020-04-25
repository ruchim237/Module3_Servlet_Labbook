package com.capg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletSecond")
public class servletSecond extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int operand1 = (Integer) request.getAttribute("ope1");
		int operand2 = (Integer) request.getAttribute("ope2");
		String button2=(String)request.getAttribute("button");
		int result1=0;		
		result1=operand1+operand2;
        PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher dispatcher = request.getRequestDispatcher("second.html");
        dispatcher.include(request, response);
        if(button2.equals("ADD"))
        {
    		out.println("<p> Addition is :"+result1+"</p><br>");
        }
        else if(button2.equals("SUB"))
        {
    		out.println("<p> Substraction is:"+(operand1-operand2)+"</p><br>");
        }
        else if(button2.equals("MUL"))
        {
    		out.println("<p> Multiplication is:"+(operand1*operand2)+"</p><pr>");
        }
		out.close();				
	}

}
