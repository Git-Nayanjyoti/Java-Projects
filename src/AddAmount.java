import java.util.Scanner;

//creating class AddAmount
public class AddAmount {
	int initialAmount = 50;

	//constructor for AddAmount class without any parameter
	AddAmount() {
		//no arguments.
	}

	//consructor for AddAmount class with parameter
	AddAmount(int amount) {
		initialAmount += amount;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		//object for none parameterized constructor.
		AddAmount withoutparameter = new AddAmount();
		System.out.println("Initial money is: $" + withoutparameter.initialAmount);
		System.out.print("Enter the some of money you want to add: $");
		int NewAmount = obj.nextInt();
		//object for parameterized constructor.
		AddAmount withparameter = new AddAmount(NewAmount);
		System.out.println("The Final amount is: $" + withparameter.initialAmount);
	}
}
