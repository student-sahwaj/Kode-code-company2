package com.whatsapp.message;

import java.io.Serializable;
//Serializable ek Marker Interface hai.
//Isko implement karne se JVM ko pata chalta hai
//ki Student class ke objects ko serialize kar sakte hain

public class Student implements Serializable {

	
	private static final long serialVersionUID = 1L;
	 private int id;
	 private String name;
	// Constructor: Object ki values initialize karta hai.
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
