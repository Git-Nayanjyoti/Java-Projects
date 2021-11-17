package collections;

import java.util.HashMap;
import java.util.Scanner;

public class compound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chemical:");
		String compound = sc.next();
		
		HashMap<String,String> dict = new HashMap<String,String>();
		dict.put("A", "T");
		dict.put("T", "A");
		dict.put("C", "G");
		dict.put("G", "C");

		String new_dna="";
		for (int i = 0; i < compound.length(); i++) {
			new_dna+=(dict.get(String.format("%c", compound.charAt(i))));
		}
		System.out.println(new_dna);
	}
}
 