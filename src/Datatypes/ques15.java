/*
Write a function which accepts principle, rate of interest, no of 
years from the user and returns the simple interest
*/
package Datatypes;
import java.util.Scanner;

public class ques15{
	//function to find the simple interest
	static void SimpleInterest(float P,float R,float T) {
		float SI = P*R*T/100;
		System.out.println("The simeple interest is: " + SI);
	}
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		//taking input of the principle, rate of interest, years
		System.out.println("Enter the Principle(P): ");
		float principle = obj.nextFloat();
		System.out.println("Enter the Rate of Interest(R):");
		float ROI = obj.nextFloat();
		System.out.println("Enter the number of year(T):");
		float Time = obj.nextFloat();
		//calling the simpleinterest funciton to find the simple interest
		SimpleInterest(principle,ROI,Time);
	}
}