package com.car_dealership_cli.user_interface;

import java.util.Scanner;


import com.car_dealership_cli.controller.PaymentController;
import com.car_dealership_cli.controller.UserController;
import com.car_dealership_cli.dao.CarDAO;

import com.car_dealership_cli.model.User;
import com.car_dealership_cli.user_interface.interfaces.Menu;

public class OwnedCars implements Menu {
	private Scanner input;
	private User user;
	boolean cont = false;
	
	public void open(Scanner a) {
		this.input = a;
		this.user = UserController.getUser(); 
		do {
			display();
			select(input.next());
		}while(!cont);

	}

	@Override
	public void display() {
		System.out.println("The vehicles you own but have payments on are listed below.");
		CarDAO cd = new CarDAO();
		System.out.println(cd.findMapUser(user.getUserId()));
		System.out.println("If you would like to view your remaining payments on a vehicle, select the vehicle in question. Otherwise enter any other key.");
	}

	@Override
	public boolean select(String in) {
		PaymentController.view(in);
		exit();
		return false;
		
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		cont = true;
	}


}
