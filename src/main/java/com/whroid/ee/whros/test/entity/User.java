package com.whroid.ee.whros.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.whroid.ee.whros.base.entity.BaseEntity;


@Entity
@Table(name = "c_user" )
public class User extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 718446031377419170L;

	@Column
	private String name;
	
	@Column 
	private String password;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
