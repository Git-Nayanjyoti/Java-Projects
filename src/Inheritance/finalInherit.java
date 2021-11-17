package Inheritance;

//class using final 
final class finalclass {
	final String name = "Final"; // final variable

	final void printName() // final method
	{
		System.out.println(name);
	}
}

public class finalInherit {
	public static void main(String[] args) {
		finalclass obj = new finalclass();
		obj.printName();
	}
}
