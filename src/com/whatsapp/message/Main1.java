package com.whatsapp.message;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 // Employee class ka original object create kiya.
			Employee emp1 = new Employee(101, "Sahwaj", 60000);
			System.out.println("Original Object");
			emp1.display();
			// SERIALIZATION....
			FileOutputStream fos = new FileOutputStream("Employee.ser");
			 // Java object ko byte stream mein convert karne mein help karega.
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 // emp1 object ka data file mein serialize karega.
			oos.writeObject(emp1);
			 // Streams close karna resources release karne ke liye.
			oos.close();
			fos.close();
			// Deserialization .....
			 // Pehle se saved employee.ser file read karega.
			FileInputStream fis = new FileInputStream("employee.ser");
			// Byte stream ko Java object mein convert karega.
			ObjectInputStream ois = new ObjectInputStream(fis);
			 // readObject():
            // File se Employee object read karke return karega.
            // Type casting karke Employee reference mein store kiya.
			Employee emp2 = (Employee)ois.readObject();
			ois.close();
			fis.close();
			 System.out.println("\nDESERIALIZED OBJECT");
			 emp2.display();
			 // clone():
	            // Original emp1 object ki ek nayi copy banayega.
			 Employee emp3 =(Employee) emp1.clone();
			 System.out.println("\nCLONED OBJECT");
			 emp3.display();
			 // == check karta hai ki dono references
	            // same object ko point kar rahe hain ya nahi.
			 System.out.println("emp1 == emp2: " + (emp1 == emp3));

	            // equals() override nahi kiya hai,
	            // isliye default Object.equals() reference compare karega.
			 System.out.println("emp1.equal(emp3): " + emp1.equals(emp3));
		} catch (Exception e) {
			 // Agar serialization, deserialization ya cloning
            // ke time exception aata hai, toh details print hongi.
			e.printStackTrace();
		}

	}

}
