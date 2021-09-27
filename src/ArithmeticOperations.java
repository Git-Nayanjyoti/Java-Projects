import java.util.Scanner;
 
public class ArithmeticOperations 
{
	//method to add,substract,multiply, divide
	static void ArithOper(int a, int b) {
		
		int add = a + b;
	    int subtract = a - b;
	    int multiply = a * b;
	    float divide = (float) a / b;
	    System.out.println("Sum = " + add);
	    System.out.println("Difference = " + subtract);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + divide);
		
	}
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float divide;
    @SuppressWarnings("resource")
    Scanner obj = new Scanner(System.in);
    //taking the input of the numbers
    System.out.println("Enter Two Numbers:");
    System.out.print("First no:");
    first = obj.nextInt();
    System.out.print("Second no:");
    second = obj.nextInt();
    //calling the method and giving it as parameter
    ArithmeticOperations.ArithOper(first, second);
  }
}