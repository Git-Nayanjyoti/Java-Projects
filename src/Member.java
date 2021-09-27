//class member with Data members
public class Member {
	String Name;
	int Age;
	long Phone_number;
	String Address;
	double Salary;
	//parameterized constructor of Member
	public Member(String Name, int Age, long Phone_number, String Address, double Salary) {
		this.Name = Name;
		this.Age = Age;
		this.Phone_number = Phone_number;
		this.Address = Address;
		this.Salary = Salary;	
	}
	//printing salary
	public void printSalary() {
		System.out.println("Salary -> " + Salary);
		
	}
}
