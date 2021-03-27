package com.ecom.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.web.entity.Users;
import com.ecom.web.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService userservice;
	
	
	//Get All users
	@GetMapping("/users")
   public List<Users> getAllUsers(){
	   return userservice.getAllMyUsers();
   }

	//Get All users by id
		 @GetMapping("/users/{u_id}")
		 public Optional<Users> getAllUsersById(@PathVariable String u_id){
			 return userservice.getAllMyUsersById(u_id);
		 }

}
