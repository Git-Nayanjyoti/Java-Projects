/* Write a program which accepts string from the user and 
display the same in console 
*/
package Datatypes;
import java.util.Scanner;

public class ques3{
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		//taking the input from the user.
		System.out.print("Enter a string:");
		String string1 = obj.nextLine();
		//displaying the string in the console
		System.out.println("The string you entered is :" + string1);
	}
}