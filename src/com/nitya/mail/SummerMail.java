package com.nitya.mail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SummerMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
	    
	    PrintWriter out =    response.getWriter();
	    out.print("夏天的邮件"+"<hr/>");
	    out.print("<a href='/DemoMail/list?username=admin'>返回上一层</a>");
	    out.print("<a href='/DemoMail/'>返回登陆页面</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
