package com.vehicle.rent.factories;

import com.vehicle.rent.model.Car;
import com.vehicle.rent.model.User;
import com.vehicle.rent.model.Vehicle;

public class CarFactory {
	public Car createCar() {
		return Car.getInstance();
	}

	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		Car c = cf.createCar();
		c.setMake(2006);
		c.setModelNo(1234);
		c.setColor("Red");
		c.setRegNo(3456);
		c.setPrice(200);
		c.setRented(0);
		c.add();
	}
}
