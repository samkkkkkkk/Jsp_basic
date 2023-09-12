package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie/servletpractice")
public class CookieServletPractice extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public CookieServletPractice() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("ss123123") && pw.equals("pw123123")) {
			
			Cookie logCoo = new Cookie("log_cookie", id);
			
			logCoo.setMaxAge(5);
			
			response.addCookie(logCoo);
			
			response.sendRedirect("/JspBasic/cookie/cookie_welcome_practice.jsp");					
			
		} else {

			response.sendRedirect("/JspBasic/cookie/cookie_login_practice.jsp");
		}

	}


}
