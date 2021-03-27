package com.ecom.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.web.entity.Users;
import com.ecom.web.repository.UserRepository;

@Service
public class UsersService {

	@Autowired
	private UserRepository userrepository;
	
	
	//Get All Users
	public List<Users> getAllMyUsers() {
		return userrepository.findAll();
				
	}

	public Optional<Users> getAllMyUsersById(String u_id) {
		return userrepository.findById(u_id);
	}
		
	
	

}