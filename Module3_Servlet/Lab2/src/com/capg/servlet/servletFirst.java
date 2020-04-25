package com.capg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletFirst")
public class servletFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int op1=Integer.parseInt(request.getParameter("op1"));
		int op2=Integer.parseInt(request.getParameter("op2"));	
		String button1 = request.getParameter("s");
		RequestDispatcher dispatcher =request.getRequestDispatcher("servletSecond");
		request.setAttribute("ope1", op1);
		request.setAttribute("ope2", op2);
		request.setAttribute("button", button1);
		dispatcher.forward(request, response);
	}
}
