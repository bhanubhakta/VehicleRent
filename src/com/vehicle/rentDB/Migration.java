package com.vehicle.rentDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			dropTables(st);
			createUserTable(st);
			createVehicle(st);
			createOrderTable(st);
			createInsuranceTable(st);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void dropTables(Statement st) {

		// String sql = "CREATE TABLE IF NOT EXISTS Users(LastName
		// varchar(255),FirstName varchar(255),Address varchar(255),Phone
		// varchar(255), isAdmin int, email varchar(255), password
		// varchar(255));";
		List<String> sqls = new ArrayList<>();
		sqls.add("drop table vehicle");
		for (String sql: sqls) {

			try {
				st.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void createUserTable(Statement st) {

		String sql = "CREATE TABLE IF NOT EXISTS Users(LastName varchar(255),FirstName varchar(255),Address varchar(255),Phone varchar(255), isAdmin int, email varchar(255), password varchar(255));";

		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createOrderTable(Statement st) {
		String sql = "CREATE TABLE IF NOT EXISTS Orders(customerEmail varchar(255), startDate int, endDate int, status int, vehicleNo int);";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createPaymentTable(Statement st) {
		String sql = "CREATE TABLE IF NOT EXISTS Payments(orderID varchar(255));";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void createInsuranceTable(Statement st) {
		String sql = "CREATE TABLE IF NOT EXISTS Insurance(price int, vehicleRegNo int);";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// private static void createAdmintable(Statement st) {
	// String sql = "CREATE TABLE IF NOT EXISTS Admin(firstName
	// varchar(255),lastName varchar(255),Address varchar(255),Phone int);";
	// try {
	// st.executeUpdate(sql);
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	private static void createVehicle(Statement st) {
		String sql = "CREATE TABLE IF NOT EXISTS Vehicle(regNo int, make int,modelNo int,color varchar(255), rented int, rentPrice int, type varchar(255));";

		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}