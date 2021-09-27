/* 
Write a function which compares two numbers are same or not
*/
package Datatypes;
import java.util.Scanner;

public class ques14{
	//function to compare the two numbers
	static void compare(int num1,int num2) {
		if(num1 == num2) {
			System.out.println("The numbers are the same");
		}else
		{
			System.out.println("The numbers are not the same");
		}
	}
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		//taking the input of the two numbers
		System.out.println("Enter the 1st number:");
		int num1 = obj.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = obj.nextInt();
		//calling the compare funcion to compare the two numbers
		compare(num1,num2);
	}
}