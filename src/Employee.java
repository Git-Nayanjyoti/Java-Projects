//inheriting Member class to Epmolyee
public class Employee extends Member{
		private String specialization;
		//parameterized constructor of Employee
		public Employee(String Name, int Age, long Phone_number, String Address, double Salary, String specialization) {
			super(Name, Age, Phone_number, Address, Salary);
			this.specialization = specialization;
		}
		//function to print Employee Data
		public void printEmployedata() {
			System.out.println("Employee -> " + Name + " " + Age + " " + Phone_number + " " + Address + " " + specialization);
			
		}
	}