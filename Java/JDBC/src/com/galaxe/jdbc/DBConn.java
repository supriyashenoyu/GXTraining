package com.galaxe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class DBConn {
	// Register Driver Class
	private static Connection conn=null;
	/**
	 * This method establishes the connection
	 * @param conn
	 */
	public static Connection getConn() throws Exception {
	Class.forName(DBConfig.DRIVER);
	// Create Connection
	conn = DriverManager.getConnection(DBConfig.DATABASE_URL, DBConfig.USERNAME, DBConfig.PASSWORD);
	System.out.println("Connection Established Successfully");
	return conn;
	}
	public static Statement getStatm() throws Exception {
		Statement statement = getConn().createStatement();
		return statement;
	}
	/**
	 * This method closes the connection
	 * @param conn
	 */
	public static void closeConn(Connection conn) {
		try {
			// close Connection
			if(conn!=null)
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
