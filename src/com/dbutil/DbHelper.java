package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbHelper {

	// 配置驱动和连接属性
	public static String driver = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/javaweb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	public static String username = "root";
	public static String password = "123456";
	public static Connection connection;

	public static Connection getConnection() {
		if(connection == null) {
			try {
				// 加载驱动，连接数据库
				Class.forName(driver);
				connection = DriverManager.getConnection(url, username, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	public static void close(PreparedStatement pst,ResultSet rst) {
		if (pst != null) {
			try {
				pst.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rst != null) {
			try {
				rst.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
