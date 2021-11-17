package collections;

import java.util.Scanner;

public class Stringpractice {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String compound = sc.nextLine();
		//System.out.println(compound);
		
		
		char[] ch = compound.toCharArray();
		for(int i = 0; i<ch.length;i++) {
			if(ch[i]=='C') {
				ch[i] = 'G';
			}else if(ch[i] == 'G') {
				ch[i] = 'C';
			}else if(ch[i] == 'A') {
				ch[i] = 'T';
			}else if(ch[i] == 'T') {
				ch[i] = 'A';
			}
		}
		StringBuilder st = new StringBuilder();
		for(int i = 0; i<ch.length;i++) {
			st.append(ch[i]);
		}

	//	String chs = Arrays.toString(ch);
		System.out.println(ch);
		
	}
}
