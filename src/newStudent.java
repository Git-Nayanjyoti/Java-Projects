import java.util.Scanner;
//class Student
public class newStudent {
	//Method to print Student name by passing parameter student name as entered by user.
	void printname(String name) {
		if (name.isEmpty()) {
			System.out.println("The name of the student is: Unknown");
		} else {
			System.out.println("The name of the student is:" + name);
		}
	}
	public static void main(String[] args) {
		String StudName = null;
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the name of the student: ");
		//object of class
		newStudent std = new newStudent();
		StudName = obj.nextLine();
		std.printname(StudName);
	}
}
