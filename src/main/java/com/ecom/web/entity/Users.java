package com.ecom.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	@Column(name="u_id")
	private String u_id;
	
	@Column(name="u_fname")
	private String u_fname;
	
	@Column(name="u_lname")
	private String u_lname;
	
	@Column(name="u_address")
	private String u_address;
	
	@Column(name="date_added")
	private String date_added;

	public Users() {
		
	}

	public Users(String u_id, String u_fname, String u_lname, String u_address, String date_added) {
		super();
		this.u_id = u_id;
		this.u_fname = u_fname;
		this.u_lname = u_lname;
		this.u_address = u_address;
		this.date_added = date_added;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_fname() {
		return u_fname;
	}

	public void setU_fname(String u_fname) {
		this.u_fname = u_fname;
	}

	public String getU_lname() {
		return u_lname;
	}

	public void setU_lname(String u_lname) {
		this.u_lname = u_lname;
	}

	public String getU_address() {
		return u_address;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	@Override
	public String toString() {
		return "Users [u_id=" + u_id + ", u_fname=" + u_fname + ", u_lname=" + u_lname + ", u_address=" + u_address
				+ ", date_added=" + date_added + "]";
	}
	
	
	

}
