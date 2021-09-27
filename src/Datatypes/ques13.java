/*
Write a function in java which accepts two number from the user and 
returns the largest one
*/

package Datatypes;
import java.util.Scanner;

public class ques13{
	//function for finding the largest number
	static int largest(int num1,int num2) {
		if(num1>num2) {
			return num2;
		}
		return num2;
	}
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		//taking the input of two numbers
		System.out.println("Enter the 1st number:");
		int num1 = obj.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = obj.nextInt();
		
		//printing the largest no among the two numbers
		System.out.println("The largest among the two number is :" + largest(num1,num2));
	}
}