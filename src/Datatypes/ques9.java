/*
 * Write a program which accepts mark from the user and display the 
 * grade as follows
 Mark      |  Grade
 0 to 49   |  Fail
 50 to 59  |  II class
 60 to 74  |  I class
 75 to 100 |  I class with distinction

Other values Invalid mark
 */


package Datatypes;
import java.util.Scanner;

public class ques9{
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your mark: ");
		int mark = obj.nextInt();
		String status = "";
		//checking the given conditions
		if(mark >=0 && mark <50) {
			status = "Fail";
		}else if(mark >=50 && mark <60){
			status = "II calss";
		}else if(mark >=60 && mark <75) {
			status = "I class";
		}else if(mark >=75 && mark <= 100) {
			status = "I class with distinction";
		}
		//print the final grade
		System.out.println("Your grade is: " + status);
		
		
	}
}