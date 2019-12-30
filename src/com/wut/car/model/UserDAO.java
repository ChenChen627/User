package com.wut.car.model;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import com.mysql.jdbc.Connection;

public class UserDAO {

	public class CarDAO{
		
		
		public List<User> listALL(){
			List<User> users=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
				
				QueryRunner run = new QueryRunner();

				ResultSetHandler<List<User>> h = new BeanListHandler<User>(User.class);

				List<User> persons = run.query("SELECT * FROM User", h);

				
				
			} catch (Exception e) {
				users=new ArrayList<>();
				e.printStackTrace();
			}
			
			
			
			return users;
		}
	}
}
