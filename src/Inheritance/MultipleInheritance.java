package Inheritance;

//creating class A
interface classA {
	static void printsubclass1() {
		System.out.println("This is subclass1");
	}
}

//creating class B
interface classB {
	static void printsubclass2() {
		System.out.println("This is subclass2");
	}
}

//inheriting both class in a single class
public class MultipleInheritance implements classA, classB {
	public static void main(String[] args) {
		classA.printsubclass1();
		classB.printsubclass2();
	}

}
