//main class student
public class newstudents {
	String name;
	int roll_no;
	String address;
	public static void main(String[] args) {
		//creating an object of the class student
		newstudents std1 = new newstudents();
		std1.name = "John";
		std1.roll_no = 2;
		std1.address = "Delhi";
		System.out.println("The roll no of the student is:" + std1.roll_no);
		System.out.println("The name of the student is:" + std1.name);
		System.out.println("The addres of the student is:" + std1.address);
		newstudents std2 = new newstudents();
		std2.name = "Sam";
		std2.roll_no = 3;
		std2.address = "Mumbai";
		System.out.println("\nThe roll no of the student is:" + std2.roll_no);
		System.out.println("The name of the student is:" + std2.name);
		System.out.println("The address of the student is: " + std2.address);
	}
}
