/*
Write a program which checks the given string is palindrome or not
*/
package Datatypes;
import java.util.Scanner;

public class ques11{
	//funcion for checking palindrome
	static boolean palindrome(String str) {
		int i = 0, j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}return true;
	}
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string to check is it is a palindrome or not:");
		String str = obj.nextLine();
		
		//Printing whether the string is palindrome or not
		if(palindrome(str)) {
			System.out.println("Yes its a palindrome");
		}else 
		{
			System.out.println("Its not a palindrome");
		}
		
	}
}