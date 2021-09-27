import java.util.Scanner;

public class SetRetClassValues {
	public static void main(String args[]) {
		newstudents.setStaticData();
		newstudents.showStaticData();
	}
}

class Student {
	//static variables
	static long phonenumber;
	static int id; 

	//static mehtods
	//static method for setting data
	static void setStaticData() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Student Id:");
		id = scan.nextInt();
		System.out.print("Enter the phonenumber:");
		phonenumber = scan.nextLong();
	}
	//static method for retrieving data
	public static void showStaticData() {
		System.out.println("The Id of the student is:" + id);
		System.out.println("The Phone number of the student is:" + phonenumber);
	}
}