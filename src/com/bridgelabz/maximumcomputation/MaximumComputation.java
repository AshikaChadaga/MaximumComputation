package com.bridgelabz.maximumcomputation;

public class MaximumComputation {

	public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maximumNumber;
		
		if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			maximumNumber = firstNumber;
		}
		else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			maximumNumber = secondNumber;
		}
		else {
			maximumNumber = thirdNumber;
		}
		
		System.out.println("The maximum number is: " + maximumNumber);
	}
	
	
	public static void findMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maximumNumber;
		
		if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			maximumNumber = firstNumber;
		}
		else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			maximumNumber = secondNumber;
		}
		else {
			maximumNumber = thirdNumber;
		}
		
		System.out.println("The maximum number is: " + maximumNumber);
	}
	
	public static void findMaximum(String firstString, String secondString, String thirdString) {
		String maximumString;
		
		if(firstString.compareTo(secondString)>0 && firstString.compareTo(thirdString)>0) {
			maximumString = firstString;
		}
		else if(secondString.compareTo(firstString)>0 && secondString.compareTo(thirdString)>0) {
			maximumString = secondString;
		}
		else {
			maximumString = thirdString;
		}
		
		System.out.println("The maximum number is: " + maximumString);
	}
	
	public static void main(String[] args) {

		System.out.println("----- Welcome To Computing Maximum Of Three Numbers Using Java Generics ------");

		Integer firstNumber = 15, secondNumber = 20, thirdNumber = 25;
		findMaximum(firstNumber, secondNumber, thirdNumber);
		
		Float number1 = 12f, number2 = 8f, number3 = 7f;
		findMaximum(number1, number2, number3);

		String firstString = "Peach", secondString = "Banana", thirdString = "Apple";
		findMaximum(firstString, secondString, thirdString);
	}


}
