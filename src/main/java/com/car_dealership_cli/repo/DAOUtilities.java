package com.car_dealership_cli.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUtilities {

	private static final String CONNECTION_USERNAME = "Hadion";
	private static final String CONNECTION_PASSOWRD = "Hal9000!";
	//jdbc:postgresql://endpoint:port/dbName?currentSchema=schema
	private static final String URL = "jdbc:postgresql://imperial-archives.cs1cruzjtwei.us-east-2.rds.amazonaws.com:5432/postgres?currentSchema=cd";
	private static Connection connection;
	
	public static synchronized Connection getConnection(){
		if (connection == null) {
			try {
				Class.forName("org.postgresql.Driver");
			}catch(ClassNotFoundException e){
				System.out.println("Could not register driver");
				e.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSOWRD);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		try {
			if (connection.isClosed()) {
				System.out.println("Opening new connection...");
				try {
					connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSOWRD);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
}
