package com.shopping.anping.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckValidateServlet extends HttpServlet {
  
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 	   response.setContentType("text/html");
 	 
      response.setHeader("Cache-Control","no-cache");
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader("Expires",0);
		response.setHeader("Pragma", "no-cache");
 	   PrintWriter out = response.getWriter();
		String a=(String) request.getSession().getAttribute("getImg");
		out.print(a);
		out.flush();
		out.close();
	}

 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 this.doGet(request, response);
	}

	 
	 

}
