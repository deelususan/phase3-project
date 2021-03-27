package com.ecom.web.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecom.web.entity.Purchase;
import com.ecom.web.repository.PurchaseRepository;

@Service
public class PurchaseService {

	@Autowired
	private PurchaseRepository purchaserepository;
	
	//Get All Purchases
	public List<Purchase> getAllMyPurchases(){
		return purchaserepository.findAll();
		
	}

	public Optional<Purchase> getAllMyPurchasesById(Long pur_id) {
		return purchaserepository.findById(pur_id);
	}

//	public  List<Purchase> getAllMyPurchasesByDate(Date pur_date) {
//		return purchaserepository.findBydate(pur_date);
//	}
	
	
	
}
