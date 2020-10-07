package com.car_dealership_cli.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUtilities {

	private static final String CONNECTION_USERNAME = "Hadion";
	private static final String CONNECTION_PASSOWRD = "Hal9000!";
	private static final String URL = "imperial-archives.cs1cruzjtwei.us-east-2.rds.amazonaws.com";
	private static Connection connection;
	
	public static synchronized Connection getConnection() throws SQLException{
		if (connection == null) {
			try {
				Class.forName("org.postgresql.Driver");
			}catch(ClassNotFoundException e){
				System.out.println("Could not register driver");
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSOWRD);
		}
		if (connection.isClosed()) {
			System.out.println("Opening new connection...");
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSOWRD);
		}
		return connection;
		
	}
}
