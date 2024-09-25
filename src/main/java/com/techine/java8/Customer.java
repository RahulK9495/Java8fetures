package com.techine.java8;

import java.util.List;

public class Customer {

	private int id;
	private String name;
	private List<String> mobilenumber;

	public Customer(int id, String name, List<String> mobilenumber) {
		super();
		this.id = id;
		this.name = name;
		this.mobilenumber = mobilenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(List<String> mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobilenumber=" + mobilenumber + "]";
	}
	
	
}
