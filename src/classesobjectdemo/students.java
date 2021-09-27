package classesobjectdemo;

public class students {
	int age = 20;
	int studID = 123;
	String studentName ="Rahul";
	String collegeName;
	int rollNo = 50;
	long phoneNo = 9876543210l;
	
	//method
	public void givesExam(int a, int b){
		System.out.println("students are giving exam");
		System.out.println(age + 123);
		System.out.println(a*b);
	}
	public void DoHomeWork() {
		System.out.println("Do home work");
	}
	
	public students() {
		System.out.println("I am sutdent constructor");
		System.out.println(this.age);
		System.out.println(this.studID);
		System.out.println(this.StudName);
	}
	public students(int studid, String name, int roll) {
		System.out.println("I am a parametrized constructor");
		this.studID = studid;
		this.StudName = name;
		this.rollNo = roll;
	}
}
