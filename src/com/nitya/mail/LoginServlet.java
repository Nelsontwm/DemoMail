package com.nitya.mail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("/errow.html").forward(request, response);
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Cookie cookie = new Cookie("username1", username);
		response.addCookie(cookie);
		
		PrintWriter out = response.getWriter();
		
		if("admin".equals(username)&&"123".equals(password)){
			out.print("»¶Ó­"+username+"µÇÂ½"+"<br/>");
			out.print("<a href='/DemoMail/list'>ÊÕ¼þÏä2</a>");
		}else {
//			response.sendRedirect("http://www.baidu.com");
			response.sendRedirect("/DemoMail/errow");
//			request.getRequestDispatcher("/errow").forward(request, response);
		}
		
	}
	
	
	
	
	
	
	
	

}
