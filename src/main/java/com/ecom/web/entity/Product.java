package com.ecom.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {


	@Id
	@Column(name="p_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long p_id;
	
	@Column(name="p_name")
	private String p_name;
	
	@Column(name="p_price")
	private float p_price;

	@Column(name="p_brand")
	private String p_brand;
	
	@Column(name="p_cid")
	private Long p_cid;
	
	@Column(name="category")
	private String category;

	public Product() {
		
	}


	public Product(Long p_id, String p_name, float p_price, String p_brand, Long p_cid, String category) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_brand = p_brand;
		this.p_cid = p_cid;
		this.category = category;
	}


	public Long getP_id() {
		return p_id;
	}

	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public float getP_price() {
		return p_price;
	}

	public void setP_price(float p_price) {
		this.p_price = p_price;
	}

	public String getP_brand() {
		return p_brand;
	}

	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}

	public String getCategory() {
		return category;
	}

		public void setCategory(String category) {
		this.category = category;
	}
		

	public Long getP_cid() {
			return p_cid;
		}


    public void setP_cid(Long p_cid) {
			this.p_cid = p_cid;
		}


		@Override
		public String toString() {
			return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_price=" + p_price + ", p_brand=" + p_brand
					+ ", p_cid=" + p_cid + ", category=" + category + "]";
		}



	
	
}
