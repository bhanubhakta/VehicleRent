package com.vehicle.rent.connectDB;

//import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	public static Connection DBConnection;
	private String url = "jdbc:mysql://localhost:3309/vehicle_rent";
	private String user = "root";
	private String password = "";

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConnection() {
		try {
			loadDriver();
			this.DBConnection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return DBConnection;
	}

	public static void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		}
	}
}
