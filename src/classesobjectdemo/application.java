package classesobjectdemo;

public class application {
	public static void main(String[] args) {
		students std1 = new students();
		students std2 = new students(1, "Ajay");
		
		variablesTypes obj = new variablesTypes();
		obj.studentName = "Ajay";
		obj.collegeName = "IIT";
		System.out.println(obj.studentName); //Ajay
		System.out.println(obj.collegeName); //IIT
		variablesTypes obj1 = new variablesTypes();
		System.out.println(obj1.studentName); //null
		System.out.println(obj1.collegeName); //IIT
		obj1.studentName = "Kashyap";
		obj1.collegeName = "Capgemini";
		System.out.println(obj1.collegeName); //Capgemini
		System.out.println(obj.collegeName); //Capgemini
		
		variablesTypes.showCollegeName();
		variablesTypes.collegeName = "IIM";
		variablesTypes.showCollegeName();
		System.out.println(Math.PI);
		
		/*
		 * Create a class
		 * with some static and instance variables
		 * with some static and instance methods
		 * Create an application class
		 * access instance variables and methods
		 * access static variables and methods
		 */
		
	}

}
