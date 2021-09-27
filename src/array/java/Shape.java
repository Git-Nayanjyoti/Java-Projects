package array.java;

import java.util.Scanner;

//The main class Shape
public class Shape {
	// sub class circle inherited from Shape with function draw and erase
	class circle extends Shape {
		static void draw() {
			System.out.println("[Operation done]: Draws a circle");
		}

		static void erase() {
			System.out.println("[Operation done]: Circle erased");
		}
	}

	// sub class triangle inherited from Shape with function draw and erase
	class triangle extends Shape {
		static void draw() {
			System.out.println("[Operation done]: Draws a triangle");
		}

		static void erase() {
			System.out.println("[Operation done]: Triangle erased");
		}
	}

	// sub class square inherited from Shape with function draw and erase
	class square extends Shape {
		static void draw() {
			System.out.println("[Operation done]: Draws a square");
		}

		static void erase() {
			System.out.println("[Operation done]: Square erased");
		}
	}

	// static method for clearing the console screen
	static void clrscr() {
		System.out.println("\u000C");
	}

	// static method for selection of shape
	static void operations() {
		@SuppressWarnings("resource")
		Scanner integer = new Scanner(System.in);
		System.out.println("Select a Shape:");
		System.out.println("1. Circle \n2. Triangle \n3. Square \n4. Exit");
		System.out.print("Please enter your choice:");
		int choice = integer.nextInt();
		switch (choice) {
		case 1:
			clrscr();
			operationofcircle();

		case 2:
			clrscr();
			operationoftriangle();

		case 3:
			clrscr();
			operationofsquare();

		case 4:
			clrscr();
			System.exit(0);

		default:
			System.out.println("You haven't selected any option");
		}
	}

	// static method for operations of circle
	static void operationofcircle() {
		do {
			System.out.println("Please select the operation:");
			System.out.println("a. Draw \nb. Erase \nc. Exit");
			System.out.print("Please enter your choice:");
			@SuppressWarnings("resource")
			Scanner string = new Scanner(System.in);
			String OperationTpyeForCircle = string.nextLine();
			int circlecount = 0;
			switch (OperationTpyeForCircle) {
			
			case "a":
				clrscr();
				circle.draw();
				circlecount += 1;
				System.out.println(circlecount);
				break;
			case "b":
				if (circlecount == 0) {
					System.out.println("Please draw a circle atleast once.");
				} else {
					clrscr();
					circle.erase();
				}
				break;
			case "c":
				clrscr();
				operations();

			default:
				System.out.println("You haven't selected any option");
			}
		} while (true);

	}

	// static method for operations of triangle
	static void operationoftriangle() {
		do {
			System.out.println("Please select the operation:");
			System.out.println("a. Draw \nb. Erase \nc. Exit");
			System.out.print("Please enter your choice:");
			@SuppressWarnings("resource")
			Scanner string1 = new Scanner(System.in);
			String OperationTpyeForTriangle = string1.next();
			int trianglecount = 0;
			switch (OperationTpyeForTriangle) {
			case "a":
				//clrscr();
				triangle.draw();
				trianglecount += 1;
				break;
			case "b":
				if (trianglecount == 1) {
					System.out.println("Please draw a triangle atleast once");
				} else {
					//clrscr();
					triangle.erase();
				}
				break;
			case "c":
				clrscr();
				operations();

			default:
				System.out.println("Please Select one option");
			}

		} while (true);
	}

	// static method for operations of square
	static void operationofsquare() {
		do {
			System.out.println("Please select the operation:");
			System.out.println("a. Draw \nb. Erase \nc. Exit");
			System.out.print("Please enter your choice:");
			@SuppressWarnings("resource")
			Scanner string2 = new Scanner(System.in);
			String OperationTpyeforSquare = string2.next();
			int squarecount = 0;
			switch (OperationTpyeforSquare) {
			case "a":
				clrscr();
				square.draw();
				squarecount += 1;
				break;
			case "b":
				if (squarecount < 1) {
					System.out.println("Please Draw a circle atleast once.");
				} else {
					clrscr();
					square.erase();
				}
				break;

			case "c":
				clrscr();
				operations();

			default:
				System.out.println("Please Select one option");
			}

		} while (true);
	}

	// The main method
	public static void main(String[] args) {
		// calling the method opearations
		do {
			clrscr();
			operations();
		} while (true);

	}
}