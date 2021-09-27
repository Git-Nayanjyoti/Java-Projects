import java.util.Scanner;

public class Area {

	static int length;
	static int breadth;
	//method to return the area of the rectangle with given length and breadth
	static int returnArea(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the length:");
		length = obj.nextInt();
		System.out.print("Enter the breadth:");
		breadth = obj.nextInt();
		System.out.println("The area of the rectangle is: " + Area.returnArea(length,breadth));
	}	
}
