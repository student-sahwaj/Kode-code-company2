package com.whatsapp.message1;

public class DataCleaner {
	public void clean(Object obj) {
		if (obj instanceof Cleanable) {
			System.out.println(" Allowed for clean");
		} else {
			System.out.println(" Not Allowed for clean");
		}
	}

}
