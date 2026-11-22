package com.whatsapp.message;

import java.io.Serializable;

//Serializable = Object ko byte stream mein convert karne ki permission.
//Cloneable = Object ki copy banane ki permission.

public class Employee implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;
	  // Constructor: Employee object create karte time data set karega.
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// Getter methods: Private data ko access karne ke liye.
	
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
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void display() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}
	 // super.clone() original object ka shallow copy banata hai.
	@Override
	public Object clone() throws CloneNotSupportedException {
		// Object class ka clone() method call hoga.
        // Ye ek naya Employee object create karega.
		return super.clone();
		
	}

}
