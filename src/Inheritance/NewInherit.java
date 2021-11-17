package Inheritance;

//creating parent class
class parent {
	void PrintParent() {
		System.out.println("This is parent class");
	}
}

//creating child class
class child extends parent {
	void PrintChild() {
		System.out.println("This is child class");
	}
}

//class showing inheritance application
public class NewInherit {
	public static void main(String[] args) {
		// creating object of parent class
		parent parentObj = new parent();

		// creating object of child class
		child childObj = new child();

		parentObj.PrintParent();
		childObj.PrintChild();
		childObj.PrintParent();
	}

}
