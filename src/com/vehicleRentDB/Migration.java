package com.vehicleRentDB;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.vehicleRentConnectDB.DBConnection;

public class Migration {
	public static void main(String[] args) {
		DBConnection dc = new DBConnection();
		DBConnection.loadDriver();
		Connection connection = dc.getConnection("jdbc:mysql://localhost:3306/vehicle_rent", "root", "");
		Statement st = null;
		try {
			st = (Statement) connection.createStatement();
			String sql = "CREATE TABLE Users(PersonID int,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255));";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
