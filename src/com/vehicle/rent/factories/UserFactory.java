package com.vehicle.rent.factories;

import com.vehicle.rent.model.User;

public class UserFactory {
	public User createUser() {
		return User.getInstance();
	}

	public static void main(String[] args) {
		UserFactory uf = new UserFactory();
		User user = uf.createUser();
		user.setAddress("Iowa");
		user.setFirstName("Bhanu Bhakta");
		user.setLastName("Sigdel");
		user.setPhoneNo(3131131);
		user.setIsAdmin(1);
		user.register();
	}
}
