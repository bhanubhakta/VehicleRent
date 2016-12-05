package com.vehicle.rent.model;

public abstract class Vehicle {
	private Rent rent;
	private int make;
	private int modelNo;
	private int regNo;
	private String color;
	private int rented;
	private double price;

//	private Vehicle() {
//
//	}

	public int getMake() {
		return make;
	}

	public int getModelNo() {
		return modelNo;
	}

	public int getRegNo() {
		return regNo;
	}

	public String getColor() {
		return color;
	}

	public void setMake(int make) {
		this.make = make;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void addRent(Rent r);
}
