package com.whatsapp.message1;

public class Address1 {
	private String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return city;
	}

}
