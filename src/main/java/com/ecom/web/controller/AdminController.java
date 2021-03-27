package com.ecom.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.web.entity.Admin;
import com.ecom.web.service.AdminService;

@RestController

public class AdminController {

	@Autowired
	private AdminService adminservice;

	@PutMapping("/change-password")
	public Admin changePassword(@RequestBody Admin admin) {
		return adminservice.updatePassword(admin);

	}

	@GetMapping("/admins")
	public List<Admin> getAllAdmins() {
		return adminservice.getAllMyAdmins();
	}

}
