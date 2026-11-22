package com.whatsapp.message1;
//Cloneable ek Marker Interface hai.
//Employee object ko cloning ke liye eligible banata hai.

public class Employee implements Cloneable {
	private int id;
	private String name;
	private  Address1 address;
	public Employee(int id, String name, Address1 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
     public Address1 getAddress1() {
		return address;
    	 
     }
     public void setName(String name) {
    	     this.name = name;
     }
     // SHALOW COPY...//
     public Employee shallowClone() throws CloneNotSupportedException {
    	// super.clone() Employee ka new object banata hai.
         // Lekin Address ka reference same rahega.
		return (Employee) super.clone();
    	 
     }
     public Employee deepClone() throws CloneNotSupportedException {
    	 Employee cloned = (Employee) super.clone();
    	 // Step 2: Address ka separate object create karna.
    	 cloned.address = new Address1(this.address.getCity());
		 return cloned;
     }
     @Override
     public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", address=" + address + '}';
    	 
     }
     
}
