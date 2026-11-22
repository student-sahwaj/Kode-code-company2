package com.whatsapp.message1;

public class Main {
	Address address;
	Employee emp1;
	Employee cloneEmp;
	public void doSomething() {
		address = new Address("16th croos", "12 cress", "Bangalore");
//		emp1 = new Employee(101, "kodeqal123", address);
//		cloneEmp = (Employee) emp1.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("16th croos", "12 cress", "Bangalore");
		Shallow shallow = new Shallow("Kodewala", "233dff", address);
     Shallow set= (Shallow)shallow.clone();
     shallow.address.city = "HYD";
     System.out.println(shallow.address.city);
     System.out.println(set.address.city);

	}

}
