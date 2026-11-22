package com.whatsapp.messageCloneable;

public class FunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculate calculate = (a,b) -> a+b;
		int result = calculate.add(10, 20);
		System.out.println("Addition: " + result);

	}

}
