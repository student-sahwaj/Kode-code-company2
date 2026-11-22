package com.whatsapp.message1;

public class Shallow implements Cloneable {
	String name;
	String shalowCode;
	Address address;
//	public char[] city;
	public Shallow(String name, String shalowCode, Address address) {
		super();
		this.name = name;
		this.shalowCode = shalowCode;
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
