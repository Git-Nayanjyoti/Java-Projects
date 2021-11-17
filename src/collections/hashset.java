package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class hashset {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(Stringpractice args[]) {
		HashMap<Stringpractice,Stringpractice> Hmap = new HashMap<Stringpractice, Stringpractice>();
		HashSet<Stringpractice> Hset = new HashSet<Stringpractice>();
		Hset.add("Nayan");
		Hset.add("Hello");
		Hset.add("Rabha");
		System.out.println(Hset);
		ArrayList<Stringpractice> Alist = new ArrayList<Stringpractice>(Hset);
		Alist.remove(2);
		System.out.println(Alist);
		for(Stringpractice m : Alist) {
			System.out.println(m);
		}
		HashSet<Stringpractice> newHset = new HashSet<Stringpractice>();
		newHset = (HashSet)Hset.clone();
		System.out.println(newHset); 
	}

}
