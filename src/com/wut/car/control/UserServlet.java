package com.wut.car.control;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wut.car.model.UserDAO;
import com.wut.car.model.User;

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
				request.setAttribute("users",users);
				request.getRequestDispatcher("UserList.jsp").forward(request,response);
				break;
			}
			case"add":
			{
				System.out.println("添加用户的方法");
				String USERNAME =request.getParameter("USERNAME");
				String SEX =request.getParameter("SEX");
				String NIANJI =request.getParameter("NIANJI");
				
				
				User user = new User();
				user.setUsername(USERNAME);
				
				
				
				
				
				
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
