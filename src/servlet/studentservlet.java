package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.service;
@WebServlet("/find")
public class studentservlet extends HttpServlet {
	service ps=new service(); 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(11);
		req.setCharacterEncoding("UTF-8");
		int age=Integer.parseInt(req.getParameter("age"));
	
		Map<String, ArrayList> list = ps.all(age);
		req.setAttribute("list", list);
		if((list!=null)) {
		req.getRequestDispatcher("index.jsp").forward(req, resp);
//		把数据发送出去
//		req.getSession().setAttribute("cart", cart);
		}
	}
	
}
