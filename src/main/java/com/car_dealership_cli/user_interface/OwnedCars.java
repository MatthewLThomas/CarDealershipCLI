package com.car_dealership_cli.user_interface;

import java.util.Scanner;

import com.car_dealership_cli.model.User;
import com.car_dealership_cli.user_interface.interfaces.Menu;

public class OwnedCars implements Menu {
	private Scanner input;
	private User user;
	
	public void open(Scanner a, User user) {
		this.input = a;
		this.user = user; 

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean select(String in) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void open(Scanner a) {
		// TODO Auto-generated method stub
		
	}

}
