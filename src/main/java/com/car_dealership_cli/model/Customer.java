package com.car_dealership_cli.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private int customerId;
	private int userId;
	private String firstName;
	private	String lastName;
	private List<String> orderIds = new ArrayList<String>();
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		firstName = name;
	}
	public List<String> getOrderIds() {
		return orderIds;
	}
	public void setOrderIds(List<String> orderIds) {
		this.orderIds = orderIds;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
