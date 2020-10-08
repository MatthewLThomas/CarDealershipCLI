package com.car_dealership_cli.user_interface;

import java.util.Scanner;

import com.car_dealership_cli.dao.UserDAO;
import com.car_dealership_cli.model.User;
import com.car_dealership_cli.user_interface.interfaces.Menu;

public class UserLogin implements Menu {
	private Scanner input; 
	private boolean cont = false;
	private User tempU = new User();
	@Override
	public void open(Scanner a) {
		this.input = a;
		do {
			display();
			select("hello");
		}while(!cont);
		exit();
	}

	@Override
	public void display() { 		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("LOGIN:\n");
		System.out.print("Username: ");
		tempU.setUserName(input.next());
		System.out.print("\nPassword: ");
		tempU.setPassword(input.next());
		System.out.println("\n");
	}
		

	@Override
	public boolean select(String in) {
		UserDAO ud = new UserDAO();
		User checkU = ud.findByUsername(tempU.getUserName());
		if(checkU.getUserName() == null) {
			System.out.println("Error: User: "+tempU.getUserName()+" does not exist.");
		}
		if(checkU.getUserName().equals(tempU.getUserName()) && !checkU.getPassword().equals(tempU.getPassword())) {
			System.out.println("Error: Incorrect Password");
		}
		if(checkU.getUserName().equals(tempU.getUserName()) && checkU.getPassword().equals(tempU.getPassword())) {
			System.out.println("Mainframe Hacked, You're in.");
			cont = true;
		}
		return false;
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

}
