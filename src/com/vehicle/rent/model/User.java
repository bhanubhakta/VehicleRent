package com.vehicle.rent.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vehicle.rent.connectDB.DBConnection;

public class User {
	private String firstName;
	private String lastName;
	private int phoneNo;
	private String address;
	private int isAdmin;

	private User() {

	}

	public static User getInstance() {
		return new User();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getLastName() {
		return lastName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void register() {
		String sql = String.format(
				"INSERT INTO users(lastName, firstName, Address, Phone, isAdmin) values ('%s', '%s', '%s', '%d', '%d');", lastName,
				firstName, address, phoneNo, isAdmin);
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
