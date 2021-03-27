package com.ecom.web.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
	
	@Id
	@Column(name="pur_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pur_id;
	
	@Column(name="category")
	private String category;
	
	@Column(name="pur_date")
	private Date pur_date;
	
	@Column(name="pur_price")
	private float pur_price;

	public Purchase() {
		
	}

	public Purchase(Long pur_id, String category, Date pur_date, float pur_price) {
		
		this.pur_id = pur_id;
		this.category = category;
		this.pur_date = pur_date;
		this.pur_price = pur_price;
	}

	public Long getPur_id() {
		return pur_id;
	}

	public void setPur_id(Long pur_id) {
		this.pur_id = pur_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getPur_date() {
		return pur_date;
	}

	public void setPur_date(Date pur_date) {
		this.pur_date = pur_date;
	}

	public float getPur_price() {
		return pur_price;
	}

	public void setPur_price(float pur_price) {
		this.pur_price = pur_price;
	}

	@Override
	public String toString() {
		return "Purchase [pur_id=" + pur_id + ", category=" + category + ", pur_date=" + pur_date + ", pur_price="
				+ pur_price + "]";
	}

	
}
