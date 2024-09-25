package com.techine.java8;

public class Employee {
	
	private int id;
	private String name;
	private double salaray;
	
	public Employee(int id, String name, double salaray) {
		super();
		this.id = id;
		this.name = name;
		this.salaray = salaray;
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

	public double getSalaray() {
		return salaray;
	}

	public void setSalaray(double salaray) {
		this.salaray = salaray;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaray=" + salaray + "]";
	}
	
	
	

}
