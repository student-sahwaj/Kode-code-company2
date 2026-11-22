package com.whatsapp.message1;

import java.io.Serializable;

public class MarkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(102, "Sahwaj");
		System.out.println("Student Id: " + student.id);
		System.out.println("Student Name: " + student.name);
		// Check kar rahe hain ki Student
        // Serializable interface implement karta hai ya nahi.
		System.out.println("Serializable: " + (student instanceof Serializable));

	}

}
