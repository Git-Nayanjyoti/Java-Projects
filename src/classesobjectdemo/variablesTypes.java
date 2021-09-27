package classesobjectdemo;

public class variablesTypes {
	/*
	 * Variables Type:
	 * 1. Global Variable: declared inside a class but outside a method
	 * 		Instance Variable: defined without a static keyword
	 * 		Static Variable: defined with a static keyword
	 * 2. Local Variable: any variable declared inside a class
	 * 					and inside a method
	 * 
	 *  From a static area, you cannot access non static members
	 *  Static method can only access static variables
	 *  Instance method can access both static and instance variables
	 */
	
	int studentId;
	String studentName;
	static String collegeName;
	
	public void m1() {
		int id=10;
		System.out.println(id);
		System.out.println(studentId);
	}
	
	public void m2() {
		//System.out.println(id);
		System.out.println(studentId);
		System.out.println(collegeName);
	}
	
	public static void showCollegeName() {
		System.out.println(collegeName);
	}
}


