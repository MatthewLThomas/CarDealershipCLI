package com.car_dealership_cli.user_interface;

import java.util.Scanner;

import com.car_dealership_cli.model.Customer;
import com.car_dealership_cli.model.User;
import com.car_dealership_cli.user_interface.interfaces.Menu;

public class NewAccout implements Menu {
	Scanner input;
	Customer newCust = new Customer();
	User newUser = new User();
	@Override
	public void open(Scanner a) {
		input = a;
		display(0);
		display(4);
		

	}

	@Override
	public void display() {
		System.out.println("Please pass in a parameter");

	}
	public void display(int a) {
		switch(a) {
		case 0:
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		case 1:
			System.out.println("Welcome to the user creation experience.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("Please enter your first name: ");
			newCust.setFirstName(input.next());
			System.out.print("\nPlease enter your last name: ");
			newCust.setLastName(input.next());
			break;
		case 2:
			System.out.print("Please enter your username: ");
			newUser.setUserName(input.next());
			break;
		case 3:
			String inOne = "Password";
			String inTwo = "password";
			boolean error = false;
			do {
				if(error) {
					System.out.println("Please enter the same passowrd Twice.");
				}
				System.out.print("Please enter your password: ");
				inOne = input.next();
				System.out.print("Please enter your password again:");
				inTwo = input.next();
				if(!inOne.equals(inTwo)) {
					error = true;
				}
			}while(!inOne.equals(inTwo));
			newUser.setPassword(inOne);
		case 4:
			System.out.print("You're all done! Redirecting you to the main menu.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.print(".");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.print(".");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		case 5:
		}
	}

	@Override
	public boolean select(String in) {
		
		return false;
	}

	@Override
	public void exit() {
		

	}

}
