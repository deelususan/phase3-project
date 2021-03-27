package com.ecom.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecom.web.entity.Product;
import com.ecom.web.exception.ProductNotFoundException;
import com.ecom.web.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productrepository;

	// Get All Products
	public List<Product> geAllMyProducts() {
		return productrepository.findAll();

	}

	// Find Products by Category Name
	public List<Product> getProductbyMyCName(String category) {
		return productrepository.findByCategory(category);
	}
	
	// Add a Product
	public Product addMyProduct(Product prod) {
		return productrepository.save(prod);
	}
	
	// Add several Products
		public List<Product> addMyProducts(List<Product> prods) {
			return productrepository.saveAll(prods);
		}

	//Update a Product
		public Product updateMyProduct(Product prod) {
			
			//Step 1: find product
		Product findProduct = this.productrepository.findById(prod.getP_id()).orElseThrow(() -> {
				throw new ProductNotFoundException("Product Not Found with id "+prod.getP_id());
			});
			
			//Step2: Set new values
			findProduct.setP_name(prod.getP_name());
			findProduct.setP_price(prod.getP_price());
			findProduct.setP_brand(prod.getP_brand());
			findProduct.setP_cid(prod.getP_cid());
			findProduct.setCategory(prod.getCategory());
			
			//Save Product
		return this.productrepository.save(findProduct);
		}	
			
	//Delete a Product by Id
		public String deleteMyProductById (Long p_id) {
								
				//Find product
				Product ProducttoDelete = this.productrepository.findById(p_id).orElseThrow(() -> {
				throw new ProductNotFoundException("Product Not Found with id"+p_id);
				});
				
				this.productrepository.delete(ProducttoDelete);
				return "Product is successfully deleted for "+p_id;
			}
				
			
		}
		
	


