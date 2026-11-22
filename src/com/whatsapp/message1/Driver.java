package com.whatsapp.message1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DataCleaner dataCleaner = new DataCleaner();
		User user = new User("Sahwaj", "23hjds");
		DataCleaner dataCleaner = new DataCleaner();
//		Object obj = user;
		dataCleaner.clean(user);
		

	}

}
