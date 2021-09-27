//creating class InterChange
public class InterChange {

	//method one with integer then character
	void sequence(int a, char b) {
		System.out.println("Sequence 1 -> " + a + "" + b);
	}
	//method two with character then integer
	void sequence(char b, int a) {
		System.out.println("Sequence 2 -> " + b + "" + a);
	}
	public static void main(String[] args) {
		int number = 7;
		char character = 'N';
		//creating  object of InterChange class
		InterChange obj = new InterChange();
		obj.sequence(number, character);
		obj.sequence(character, number);
	}
}
