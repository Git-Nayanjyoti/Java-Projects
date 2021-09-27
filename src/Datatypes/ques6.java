/* 
Write a program which accepts the number from the user and display
the multiplication table in the below format
1* number = result
2* number = result

Eg. if number = 2
   1* 2 = 2
   2* 2 = 4
   ....
   16* 2 = 32
*/
package Datatypes;
import java.util.Scanner;
public class ques6
{
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource") 
		Scanner obj = new Scanner(System.in);
		//taking the number from the user
		System.out.println("Enter a number whose multiplication table you want to display:");
		int num = obj.nextInt();
		System.out.println("The multiplication table of:" + num + "is");
		//displaying the table according to the required format
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + "*" + num + "=" + (i*num ));
		}
	}
}
