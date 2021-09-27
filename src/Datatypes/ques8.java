/*
Write a program which accepts the number from the user till he presses
-999 and display the total and average
*/

package Datatypes;
import java.util.Scanner;

public class ques8{
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		int count = 0;
		double Total = 0;
		int num = 0;
		//taking the input numbers
	    System.out.println("Enter some numbers and enter -999 to exit:");
		while(num != -999) {
			num = obj.nextInt();
			Total += num;
			count += 1;
		}
		if(count == 0)
		{
			System.out.println("Enter some numbers:");
		}else
		{
			//print the Total and the average of the numbers
			System.out.println("The Total is: " + (Total + 999) + " and average of the entered no is: " + ((Total+999)/(count - 1)));
		}
		
	}
}