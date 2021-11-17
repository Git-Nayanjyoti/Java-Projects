package Inheritance;

//creating class animals
class animals {
	// Dogs is child class of animals
}

//creating class dog
class dog extends animals {
	void shout() {
		System.out.println("Dog will bark");
	}
}

//creating class cat inherited from dog
class cat extends dog {
	void shout() {
		System.out.println("Cat will shout like miyaav....");
	}
}

//class InheritAnimals shouw the application of inheritance
public class InheritAnimals {
	public static void main(String[] args) {
		// creating object of dog
		dog dogObj = new dog();
		dogObj.shout(); // shout method from dog

		// creating object of cat
		cat catObj = new cat();
		catObj.shout(); // shout method from cat
	}

}
