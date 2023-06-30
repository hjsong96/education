package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	//데이터베이스 접속 정보를 저장합니다.
	
	public Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://localhost:3306/employees";
			conn = DriverManager.getConnection(url, "root", "0614");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
}
