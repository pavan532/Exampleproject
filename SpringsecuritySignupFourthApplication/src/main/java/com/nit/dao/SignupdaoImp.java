package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dto.CustomerDto;

@Repository
@Transactional
public class SignupdaoImp implements signupdao {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void save(CustomerDto custmer) {
	
		String sql="insert into users values(?,?,?)";
		String sql1="insert into authorities values(?,?)";
		
		template.update(sql, custmer.getUsername(),custmer.getPassword(),1);
		template.update(sql1, custmer.getUsername(),"USER");

		System.out.println("inserted .......");
	}

}
