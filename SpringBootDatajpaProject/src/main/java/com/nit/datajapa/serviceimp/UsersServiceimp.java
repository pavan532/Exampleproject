package com.nit.datajapa.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.datajapa.entity.Users;
import com.nit.datajapa.payload.UsersDto;
import com.nit.datajapa.repositary.UsersRpositary;
import com.nit.datajapa.service.UsersServices;

@Service
public class UsersServiceimp implements UsersServices {

	@Autowired
	private UsersRpositary Userrepositary;
	
	@Override
	public UsersDto createuser(UsersDto userdto) {
		
		Users user =userEntity(userdto);
		
		Users repo = Userrepositary.save(user);
		
		return userdtoEntity(repo);
	}

	private Users userEntity(UsersDto userdto) {
		Users user =new Users();
		user.setId(userdto.getId());
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		
		return user;
	}
	
	  private UsersDto userdtoEntity(Users users) {
		  
		UsersDto userdto=new UsersDto();
		
		userdto.setId(users.getId());
		userdto.setName(users.getName());
		userdto.setEmail(users.getEmail());
		userdto.setPassword(users.getPassword());
		
		return userdto;
	}
}
