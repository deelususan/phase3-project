package com.ecom.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")

public class Admin {
@Id
	@Column(name="admin_id")
	private int admin_id;
	
	@Column(name="admin_pwd")
	private String admin_pwd;

	public Admin() {
		
	}

	public Admin(int admin_id, String admin_pwd) {
		this.admin_id = admin_id;
		this.admin_pwd = admin_pwd;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_pwd() {
		return admin_pwd;
	}

	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_pwd=" + admin_pwd + "]";
	}
	

}
