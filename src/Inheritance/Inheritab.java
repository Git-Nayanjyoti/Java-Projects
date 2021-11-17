package Inheritance;

//creating class a
class a{
	void printa() {
		System.out.println("This is from class a");
	}
}

//creating class b
class b extends a{
	void printb() {
		System.out.println("This is from class b");
	}
}

//class where inheritance is done
public class Inheritab {
	public static void main(String[] args) {
		//creating obj of b and calling method of a in it.
		b obj = new b();
		obj.printa();
		obj.printb();
	}
}
