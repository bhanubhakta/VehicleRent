package com.vehicle.rent.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Vehicle> vehicles = new ArrayList<>();
	private long startTime;
	private long endTime;

	private Order() {

	}
}
