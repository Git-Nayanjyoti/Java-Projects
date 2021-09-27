package linkedlist.java;
//creating a method to duplicate the string 
public class Duplicate {
	public static void makecopy(String strname, int times) {
		for (int i = 0; i < times; i++) {
			System.out.print(strname);
		}
	}
	public static void main(String[] args) {
		//Calling the makecopy function to copy the string 
		makecopy("hi", 3);
	}
}
