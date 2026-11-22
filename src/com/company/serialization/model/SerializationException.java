package com.company.serialization.model;
//RuntimeException inherit kar rahe hain.
//Isse hum apni application-specific exception bana sakte hain.

public class SerializationException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	public SerializationException(String message, Throwable cause) {
		 // Parent RuntimeException ko message aur original error
        // pass kar rahe hain, taaki debugging easy ho.
		super(message,cause);
	}
	

}
