package com.whatsapp.message1;

public class CloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Address1 address1 = new Address1("Delhi");
		Employee original = new Employee(101, "Arsad", address1);
		System.out.println("Original Employee");
		System.out.println(original);
		
		// ..... SHALLOW COPY.....//
		Employee shallow = original.shallowClone();
		 // Cloned Employee ka city change kar rahe hain.
        // Original ka city bhi change hoga.
        // Kyunki dono same Address object share karte hain.
		shallow.getAddress1().setCity("Bihar");
		System.out.println("\n Shallow Copy Result:");
		System.out.println("Original: " + original);
		System.out.println("Shallow: " + shallow);
		System.out.println("same Address? " + (original.getAddress1()== shallow.getAddress1()));
		// DEEP COPY.....//
		// Fresh original object create kar rahe hain.
		Address1 address12 = new Address1("Delhi");
		Employee original2 = new Employee(102, "Ansari", address12);
		Employee deep = original2.deepClone();
		 // Sirf cloned Employee ka city change hoga.
        // Original Employee ka city same rahega.
		deep.getAddress1().setCity("RaJASTAN");
		System.out.println("/n Deep copy Result");
		System.out.println("deep clone: " + deep);
		System.out.println("Same address? + " + (original2.getAddress1() == deep.getAddress1()));
	}

}
