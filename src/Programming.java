import java.util.Scanner;

//creating class Programming
public class Programming {

	//method to print 
	void print(String name) {
		if (name.isBlank()) {
			name = "Programming Languages";
			System.out.println("I love " + name);
		} else {
			System.out.println("I love " + name);
		}

	}

	public static void main(String[] args) {
		String StudName = null;
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a string: ");
		//creating object of class programming
		Programming prog = new Programming();
		StudName = obj.nextLine();
		//calling the print method with parameter
		prog.print(StudName);
	}
}
