//sub class Square of Rectangle
public class Square extends Rectangle{
			public void printsquare() {
				System.out.println("Square is a rectangle");
			}
			public static void main(String[] args) {
				Square obj1 = new Square();
				obj1.printshape();
				obj1.rectangle();
				obj1.printsquare();
			}
}
