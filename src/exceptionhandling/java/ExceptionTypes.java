package exceptionhandling.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTypes {

	/*
	 * 2 Types
	 * 1. Checked: java prompts for error in compile time
	 * 2. Unchecked: java does not prompts for error
	 */
	
	public static void main(String[] args) {
		//FileReader reader = new FileReader("");
		
		try {
			System.out.println(5/2);
			@SuppressWarnings("resource")
			FileReader reader = new FileReader("");
		} catch (ArithmeticException e) {
			System.out.println("Divide by Zero is not allowed");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		//ArrayIndexOutOfBound
		
		
	}
}