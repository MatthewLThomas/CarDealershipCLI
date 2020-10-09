package com.car_dealership_cli.controller;

import com.car_dealership_cli.model.User;

public class UserController {
	public static User user;
	
	public static User getUser() {
		return user;
	}
	public static void setUser(User u) {
		user = u;
	}
}
