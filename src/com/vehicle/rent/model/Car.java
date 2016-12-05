package com.vehicle.rent.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vehicle.rent.connectDB.DBConnection;

public class Car extends Vehicle {

	@Override
	public void addRent(Rent r) {
		// TODO Auto-generated method stub

	}

	public static Car getInstance() {
		return new Car();
	}

	public void add() {
		String sql = String.format(
				"INSERT INTO vehicle(make, modelNo, regNo, color, rented, price) values ('%d', '%d', '%d', '%s', '%d', '%f');",
				make, modelNo, regNo, color, rented, price);
		DBConnection dc = new DBConnection();
		Connection c = dc.getConnection();
		Statement st = null;
		try {
			st = c.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
