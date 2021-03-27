package com.ecom.web.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.web.entity.Admin;
import com.ecom.web.exception.ProductNotFoundException;
import com.ecom.web.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminrepository;
	
	public List<Admin> getAllMyAdmins(){
		return adminrepository.findAll();
	}
	
	public Admin updatePassword(Admin admin) {
		
		//Step 1: find user
		Admin finduser = this.adminrepository.findById(admin.getAdmin_id()).orElseThrow(() -> {
				throw new ProductNotFoundException("Product Not Found with id "+admin.getAdmin_id());
			});
		
		//Set Value
		finduser.setAdmin_pwd(admin.getAdmin_pwd());
		
		
		//Save
		return this.adminrepository.save(finduser);
	}

}
