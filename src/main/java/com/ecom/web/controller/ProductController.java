package com.ecom.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.web.entity.Product;
import com.ecom.web.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	//Get all products

	@GetMapping("/products")
	public List <Product> getAllProducts(){
		return productservice.geAllMyProducts();
		
	}
	
	// Find Products by Category Name
	 @GetMapping("/products/{category}")
	 public List<Product> getAllProductsByCName(@PathVariable String category) {
		 return productservice.getProductbyMyCName(category);
	 }
	 

	//Add a Product
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
			return productservice.addMyProduct(product);
	}
	 
	 

	//Add several Products
	@PostMapping("/addproducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
			return productservice.addMyProducts(products);
	} 
	 
	//Update a Product
	@PutMapping("/updateproduct")
	public Product updateProduct(@RequestBody Product product) {
		return productservice.updateMyProduct(product);
	}
	
	//Delete a Product by Id
     @DeleteMapping("/deleteproduct/{p_id}")
     public String deleteProductById (@PathVariable("p_id") long prodid) {
    	return productservice.deleteMyProductById(prodid);
     }
	
     
}
