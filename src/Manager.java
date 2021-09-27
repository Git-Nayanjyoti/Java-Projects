//inheriting Member class to Manager
public class Manager extends Member {
		private String department;
		//parameterized constructor of Manager
		public Manager(String Name, int Age, long Phone_number, String Address, double Salary, String department) {
			super(Name, Age, Phone_number, Address, Salary);	
			this.department = department;
		}
		//function to print Manager Data
		public void printManagerdata() {
			System.out.println("Manager -> " + Name + " " + Age + " " + Phone_number + " " + Address + " " + department);
		}
	}