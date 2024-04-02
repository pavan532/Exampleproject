package com.nit.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Service;

import com.nit.dto.UserDto;

@Service
public class UserServiceimp implements Usreservice {

	@Autowired
	private JdbcTemplate template;

	@Override
	public void Saveuser(UserDto user) {
		
		String sql="insert into users values(?,?,?)";
		String sql1="insert into authorities values(?,?)";
		
		template.update(sql, new PreparedStatementSetter() {
		
		@Override
		public void setValues(PreparedStatement ps) throws SQLException {
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setInt(3, 1);
			
		}
	});
	   
		template.update(sql1, new PreparedStatementSetter() {
		
		@Override
		public void setValues(PreparedStatement ps) throws SQLException {
		
			ps.setString(1, user.getUsername());
			ps.setString(2, "coder");
		}
	});
		System.out.println("Sussesfully data Stored..");
	}
		
}
