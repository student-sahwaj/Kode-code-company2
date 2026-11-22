package com.whatsapp.messageCloneable;
//Cloneable implement karne se Employee object
//Java cloning mechanism ke liye eligible hota hai.
public class Employee implements Cloneable {
	private int id;
	private String name;
	// Employee ke andar Address ka reference hai.
    // Ye ek nested mutable object hai.
	private Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	//  DEEP CLONING //
	@Override
	public Employee clone() throws CloneNotSupportedException {

		// STEP 1:
        // super.clone() Employee ka shallow copy banata hai.
        //
        // Is stage par id aur name copy ho jayenge.
        // Lekin address ka reference same rahega.
		Employee clonedEmployee =  (Employee) super.clone(); // down casting 
		 // STEP 2:
        // Address ka separate object create kar rahe hain.
        //
        // this.address.clone() original Address ki
        // independent copy create karta hai.
        //
        // Ab original aur cloned Employee ke paas
        // alag-alag Address objects honge.
		clonedEmployee.address = this.address.clone();
		// STEP 3:
        // Completely cloned Employee object return karna.
		return clonedEmployee;
	}
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", address= " + address + '}';
		
	}

}
