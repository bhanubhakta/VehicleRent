package com.vehicle.rentDB;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.vehicle.rent.connectDB.DBConnection;

public class Migration {
	public static void main(String[] args) {
		DBConnection dc = new DBConnection();
		DBConnection.loadDriver();
		Connection connection = dc.getConnection();
		Statement st = null;
		try {
			st = (Statement) connection.createStatement();
			createUserTable(st);
			createVehicle(st);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createUserTable(Statement st) {
		String sql = "CREATE TABLE IF NOT EXISTS Users(LastName varchar(255),FirstName varchar(255),Address varchar(255),Phone int, isAdmin int);";

		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createVehicle(Statement st) {
		String sql = "CREATE TABLE IF NOT EXISTS Vehicle(make int,modelNo int,regNo int,color varchar(255), rented int, price int);";

		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
