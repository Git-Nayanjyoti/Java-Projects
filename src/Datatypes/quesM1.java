package Datatypes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class quesM1 {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scan.next();
        countDiffStringCharTypes(input);
    
	}

	public static int[] countDiffStringCharTypes(String input) {
        int length = input.length();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< length; i++) {
        	list.add(null);
        }
    
        for(int i = 0; i < list.size(); i++) {
        	list.set(i, ((int) input.charAt(i)));
        }
        //System.out.println(list);
        int upper = 0;
        int lower = 0;
        int number = 0;
        int special = 0;
        
        for(int i = 0; i<list.size(); i++) {
        	int num = list.get(i);
        	if(num >= 65 && num<= 90) {
        		upper++;
        	}else if(num >= 97 && num <= 122){
        		lower++;
        	}else if(num >= 48 && num <= 57) {
        		number++;
        	}else {
        		special++;
        	}
        	
        }
        //System.out.println(upper+ " " + " " + lower+ " " + number+  "" + special);
        int[] output = {upper,lower,number,special};
        System.out.println("Output:" + Arrays.toString(output));
        return output;
       
	}

}
