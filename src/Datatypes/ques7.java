/*
write a program which input the old meter reading, new meter reading
form the user and calculates the total units (total units = new meter
reading - old meter reading). Based on the total units, charges to be 
printed on the screen as follows.

Units         |    charges
1 - 100       |   Nil
101 - 200     |   Re. 2 per unit
201 - 300     |   Re. 3 per unit
301 - 400     |   Re. 4 per unit
401 and above |   Re. 5 per unit + 10 % tax

*/

package Datatypes;
import java.util.Scanner;

public class ques7
{
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		//taking the input of meter reading
		System.out.println("Enter the old meter reading:");
		int OldReading = obj.nextInt();
		System.out.println("Enter the new meter reading:");
		int NewReading = obj.nextInt();
		int Total = NewReading - OldReading;
		double charges = 0;
		//checking the given conditions
		if(Total >= 1 && Total <101)
		{
			charges = Total * 0;
		}
		else if(Total >=101 && Total <201) {
			charges = Total * 2;
		}
		else if(Total >=201 && Total <301){
			charges = Total * 3;
		}else if(Total >= 301 && Total <401) {
			charges = Total * 4;
		}else if(Total >= 401) {
			charges = Total * 5;
			charges *= .10; 
		}
		//print the final charges
		System.out.println("The charges = " + charges);
			
	}
}