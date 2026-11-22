package com.whatsapp.message;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student set = new Student(101, "Kodewala");
		 // FileOutputStream:
        // student.txt file mein data write karne ke liye stream banata hai.
		
		FileOutputStream fos = new FileOutputStream("student.txt");
		 // ObjectOutputStream:
        // Java object ko byte stream mein convert karne mein help karta hai
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(set);
		oos.close();
		System.out.println("Serialization Successful");
		   
	    // ================= DESERIALIZATION =================//
		
		// FileInputStream:
        // student.txt file se data read karne ke liye stream banata hai.
		FileInputStream fis = new FileInputStream("student.txt");
		 // ObjectInputStream:
        // File se byte stream ko Java object mein convert karta hai.
		ObjectInputStream ois = new ObjectInputStream(fis);
		// readObject():
        // File se serialized object ko wapas retrieve karta hai.
        // Type casting karke Student object mein convert kiya.
		Student obj =(Student) ois.readObject();
		// Retrieved object ki values print karna.
		System.out.println("Deserialization Successful");
		System.out.println("Student ID: " + obj.getId());
		System.out.println("Student Name: " + obj.getName());
		ois.close();
		;
	}

}
