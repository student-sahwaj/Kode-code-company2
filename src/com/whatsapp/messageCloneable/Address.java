package com.whatsapp.messageCloneable;
//Cloneable ek Marker Interface hai.
//Iska matlab Address class ke objects cloning ke eligible hain.

public class Address implements Cloneable {
 private String city;
 private String state;
 public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
 }

 public String getCity() {
	return city;
 }
 
 public void setCity(String city) {
	this.city = city;
 }
 
 public String getState() {
	return state;
 }
 
 public void setState(String state) {
	this.state = state;
 }
 // Clone method override kar rahe hain.
 // public isliye kiya kyunki Object class ka clone()
 // protected hota hai.
  @Override
  public Address clone() throws CloneNotSupportedException {
	  // super.clone() current Address object ki
      // shallow copy create karta hai.
      //
      // Yahan city aur state String references copy hote hain.
      // String immutable hai, isliye sharing safe hai.
	return (Address) super.clone();
	  
  }
  // Object ki details readable format mein print karta hai.
  @Override
  public String toString() {
	return "Address {" + "city='" + city + '\'' + ", State='" + state + '\'' + '}';
	  
  }
 
}
