package com.nitya.mail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
	    response.setCharacterEncoding("utf-8");
//	    String username  = request.getParameter("username");
	    
	    String username = null ;
	    
	     Cookie[] cookies =request.getCookies();
	     for(Cookie co:cookies){
	    	 if("username1".equals(co.getName())){
	    		 username = co.getValue();
	    	 }
	     }
	    
	    PrintWriter out =    response.getWriter();
	    out.print("欢迎:"+username+"<br/>");
		out.print("<a href='/DemoMail/summer'>夏天的邮件</a><br/>");
		out.print("<a href='/DemoMail/winter'>冬天的邮件</a>");
	}

}
