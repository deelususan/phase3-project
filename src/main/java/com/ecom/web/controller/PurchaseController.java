package com.ecom.web.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.web.entity.Purchase;
import com.ecom.web.service.PurchaseService;

@RestController
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseservice;
	
	//Get All users
	@GetMapping("/purchases")
	public List<Purchase>getAllPurchases(){
		return purchaseservice.getAllMyPurchases();
	}
	
	@GetMapping("/purchases/{pur_id}")
	public Optional<Purchase> getAllPurchasesById(@PathVariable Long pur_id){
		return purchaseservice.getAllMyPurchasesById(pur_id);
	}
	
//	@GetMapping("/purchases/{pur_date}")
//	public List<Purchase> getAllPurchasesByDate(@PathVariable Date pur_date){
//		return purchaseservice.getAllMyPurchasesByDate(pur_date);
	//}
	
}
