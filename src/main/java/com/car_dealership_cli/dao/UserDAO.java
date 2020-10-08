package com.car_dealership_cli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.car_dealership_cli.model.User;
import com.car_dealership_cli.repo.DAOContract;
import com.car_dealership_cli.repo.DAOUtilities;

public class UserDAO implements DAOContract<User, Integer> {

	@Override
	public List<User> findAll() {
		Connection con = DAOUtilities.getConnection();
		List<User> usrList = new ArrayList<User>();
		String sql = "select * from cduser;"; 
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				User tempUser = new User(rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5));
				usrList.add(tempUser);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usrList;
	}

	@Override
	public User findById(Integer i) {
		
		return null;
	}

	@Override
	public User update(User t) {
		
		return null;
	}

	@Override
	public User create(User t) {
		
		return null;
	}

	@Override
	public int delete(Integer i) {
		
		return 0;
	}

}
