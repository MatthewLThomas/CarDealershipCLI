package com.car_dealership_cli.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private int customerId;
	private int userId;
	private String Name;
	private String Email;
	private List<String> orderIds = new ArrayList<String>();
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
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
