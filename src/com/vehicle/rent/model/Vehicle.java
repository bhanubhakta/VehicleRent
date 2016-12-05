package com.vehicle.rent.model;

public abstract class Vehicle {
	// private Rent rent;
	protected int make;
	protected int modelNo;
	protected int regNo;
	protected String color;
	protected int rented;
	protected double price;

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

	public int getRented() {
		return rented;
	}

	public double getPrice() {
		return price;
	}

	public void setRented(int rented) {
		this.rented = rented;
	}

	public void setPrice(double price) {
		this.price = price;
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
