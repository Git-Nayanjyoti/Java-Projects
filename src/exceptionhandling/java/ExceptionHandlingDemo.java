package exceptionhandling.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		/*
		 * Exception is any unwanted interruption to the flow of program
		 * 
		 * try: any risky code will be here
		 * catch: what to do if there is any error will be mentioned here
		 * finally: what should be done if there is an error or if there is no error
		 * 
		 * connect to DB
		 * read data
		 * close DB connection
		 * 
		 * unable to read data
		 * still close DB connection 
		 */
		
		String filePath = "./src/FileHandlingDemo/data1";
		try {
			System.out.println("I am in try block");
			FileReader reader = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("I am in catch block");
		} finally {
			System.out.println("Closing the connection");
		}
		
	}
}