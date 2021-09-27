/*
 * Write a program which accepts number from the user and
check it is divisible by seven or not
*/
package Datatypes;
import java.util.Scanner;

public class ques2
{
	public static void main(String[] args)
	{
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = Obj.nextInt();
		//checking if the number is is divisible by seven or not and printing the result
		if(num%7 == 0) 
		{
			System.out.println("The number is divisible by seven");
			
		}
		else 
			System.out.println("The number is not divisible by seven");	
	}
}