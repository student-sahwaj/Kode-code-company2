package com.company.serialization.model;

import java.io.Serializable;
//Serializable ek Marker Interface hai.
//Isme koi method nahi hota.
//Isko implement karne se class ke objects

public final class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private final int id;
	private final String name;
	public Student(int id, String name) {
		 // Student ID validate kar rahe hain.
		if (id <= 0) {
			throw new IllegalArgumentException("Invalid Student ID");
		}
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Invalid Student name");
		}
		this.id = id;
		this.name = name;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	 // Object ko readable format mein print karne ke liye.
	@Override
	public String toString() {
		return "Student{id=" + id + " , name= " + "'}";
	
	}
	

}
