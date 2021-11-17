package array.java;

public class Checking {
	public static void main(String[] args) {
		String val = "CGAT";
		String[] temp = val.split("", val.length());
		
//		if(val.contains("A"))
		val.replace("A", "T"); 
		for (String m : temp) {
			System.out.println(m);
			
		}
		System.out.println(val);
	}
 
}
