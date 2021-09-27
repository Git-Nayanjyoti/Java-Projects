//class to print the Employee and Manager data
public class print{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Rahul",23, 9876543210l, "Assam", 25000, "JavaSelenium");
		Manager manager1 = new Manager("Vishal",36, 9876567210l, "Banglore", 50000, "HR");
		//print the data and salary of employee 1
		emp1.printEmployedata();
		emp1.printSalary();
		//print the data and salary of manager 1
		manager1.printManagerdata();
		manager1.printSalary();		
	 }
   }
