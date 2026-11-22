package com.whatsapp.messageCloneable;

public class Main {
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		 // Address ka original object create kiya.
		Address address = new Address("Bangalore", "Karnataka");
		 // Employee object create kiya.
        // Is Employee ke andar Address ka reference hai.
		Employee employee = new Employee(101, "Sahwaj", address);
		System.out.println("Original employee");
		System.out.println(employee);
		 // original.clone() call karne par
        // Employee class ka clone() execute hoga.
        //
        // Employee ki independent copy create hogi.
        // Address ki bhi independent copy create hogi.
		Employee cloned = employee.clone();
		System.out.println("Cloned employee");
		System.out.println(cloned);
		 // CLONED OBJECT MODIFY KARNA

        // Sirf cloned Employee ka name change kar rahe hain.
		cloned.setName("Ansari");
		// Sirf cloned Employee ka city change kar rahe hain.
        // Deep Copy ki wajah se original Address change nahi hoga.
		cloned.getAddress().setState("Bihar");
		System.out.println("After Modification:");
		System.out.println("Original Employee");
		// ab modification object value print hogi
		System.out.println("Cloned Empoyee");
		System.out.println(cloned);
		// Check kar rahe hain ki dono Employee
        // same object hain ya different.
		System.out.println("Same Employee object?" + (employee == cloned));
		 // Check kar rahe hain ki dono ke Address
        // same object hain ya different.
		System.out.println("Same Address Object? " + (employee.getAddress() == cloned.getAddress()));

	}

}
///**
// * Concept        Meaning
//Cloneable	     Marker Interface
//clone()	     Object ki copy create karta hai
//super.clone()	 Shallow copy create karta hai
//Deep Copy	     Nested mutable objects ki independent copy
//==	             Reference comparison
//throws	         Exception calling method ko propagate karta hai
//**
