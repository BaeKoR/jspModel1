package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static void initConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver Loading Success");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("");
		}
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.102:3306/mydb", "root", "1234");
			
			System.out.println("Connection Success");
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("");
		}
		
		return conn;
	}
	
}
