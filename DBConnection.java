package com.javatpoint.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() throws Exception {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://reportdb1.crwhaclu1cjj.us-east-2.rds.amazonaws.com/report", "root", "admin123");
			System.out.println("123459:"+con);
		} catch (Exception e) {
			throw e;
		}
		return con;
	}
}
