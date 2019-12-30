package com.wut.car.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.wut.car.model.UserDAO;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private UserDAO dao= new UserDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method=request.getParameter("method");
		switch(method){
			case"listALL":
			{
				System.out.println("查询显示有的后台记录");
				List<User> users=dao.listAll();
				System.out.println(users.size());
				break;
			}
			case"add":
			{
				System.out.println("添加用户的方法");
				break;
			}
			case"delete":
			{
				System.out.println("删除用户的方法");
				break;
			}
			case"update":
			{
				System.out.println("修改用户的方法");
				break;
			}
			
		}
	}

}
