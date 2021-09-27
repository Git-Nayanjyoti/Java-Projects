/* 
Write a function in java which accepts 5 strings from the user and 
reutrns the largest one
*/
package Datatypes;
import java.util.Scanner;

public class ques12{
	//function for finding the largest among the string
	static void largest(String str1,String str2, String str3, String str4, String str5) {
		int s1= str1.length(),s2=str2.length(),s3=str3.length(),s4=str4.length(),s5=str5.length();
		
		if(s1>s2 && s1>s3 && s1>s4 && s1>s5) {
			System.out.println("The largest is :" + str1);
		}else if(s2>s1 && s2>s3 && s2>s4 && s2>s5) {
			System.out.println("The largest is : " + str2);
		}else if(s3>s1 && s3>s2 && s3>s4 && s3>s5) {
			System.out.println("The largest is :" + str3);
		}else if(s4>s1 && s4>s2 && s4>s3 && s4>s5) {
			System.out.println("The largest is :" + str4);
		}else {
			System.out.println("The largest is :" + str5);
		}
	}
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 5 strings:");
		String str1= obj.nextLine();
		String str2 = obj.nextLine();
		String str3 = obj.nextLine();
		String str4 = obj.nextLine();
		String str5 = obj.nextLine();
	
		//calling the largest funciont to find the largest string.
		largest(str1,str2,str3,str4,str5);
		
		
	}
}