package com.shopping.anping.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopping.guoguo.pojo.User;

public class CheckUserIsLoginServlet extends HttpServlet {
 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
      response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    User user  =   (User)  request.getSession().getAttribute("user");
		  int   isLogin  = 1;//1 代表的是登陆了
	    if(user == null){
			 isLogin  = 0;  //0代表的是未登录了
		 }
	    out.println(isLogin);
		out.flush();
		out.close();
	}

 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	     this.doGet(request, response);
	}

}
