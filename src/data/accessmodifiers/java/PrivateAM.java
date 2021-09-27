/**
 * 
 */
package data.accessmodifiers.java;

/**
 * @author nayanjyotirabha
 *
 */
public class PrivateAM {
	private void display() {
		System.out.println("This is private");
		int a = 5;
		
	}
	private display() {
		return a;
	}

}
