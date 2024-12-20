package com.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class RjModel {
	public static Connection c;
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/batch181";
			String user="root";
			String pass="root";
			c=DriverManager.getConnection(url,user,pass);
			return c;
		} catch (Exception e) {
			return null;
		}
		
	}

}
