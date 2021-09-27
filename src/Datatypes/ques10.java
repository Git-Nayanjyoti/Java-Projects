/* Write a program which prints the no of vowels from the given 
string
*/

package Datatypes;
import java.util.Scanner;

public class  ques10{
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string:");
	    String word = obj.nextLine();
	    //coverting the string to lowercase
	    word = word.toLowerCase();
	    int count = 0;
	    for(int i=0;i<word.length();i++) {
	    	if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
	    		count++;
	    	}
	    }
	    //Printing the # of vowels 
	    System.out.println("The number of vowels in the string is: " + count);
	
	}
}