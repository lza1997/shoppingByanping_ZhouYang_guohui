package com.shopping.guoguo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.shopping.guoguo.pojo.Goods;
import com.shopping.guoguo.service.impl.GoodsServiceImpl;

public class ShowGoodsDetailsServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GoodsDetail.do");
		int gid = (Integer.parseInt(request.getParameter("gid")));
		Goods good = GoodsServiceImpl.getInstance().receiveGoodByGid(gid);
		request.setAttribute("good", good);
		request.getRequestDispatcher("./manage/goods_detail.jsp").forward(request, response);

	}

}
