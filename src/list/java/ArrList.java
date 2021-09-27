package list.java;

import java.util.ArrayList;
import java.util.Collection;

public class ArrList {
	/*
	 * ArrayList: is a class implementing List interface used to store multiple
	 * elements of similar data type
	 * 
	 * Rules: It maintains insertion order First cum first serve elements are stored
	 * in contagious memory locations list can store duplicate elements
	 * 
	 */

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		list.add(120);
		list.add(50);
		list.add(40);
		list.add(420);
		list.add(10);
		System.out.println(list);
		list.add(1, 500);
		System.out.println(list);

		System.out.println("Getting single element " + list.get(2));
		list.set(2, 501);
		System.out.println("Getting single element " + list.get(2));
		System.out.println("The size is " + list.size());
		System.out.println("Original List " + list);
		list.remove(0);
		System.out.println("List after removing 0th Index " + list);
		// list.clear();
		// System.out.println(list);
		System.out.println(list.isEmpty());

		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(1001);
		newList.add(1002);
		newList.add(1003);
		System.out.println("New List is " + newList);
		list.addAll(1, newList);
		System.out.println("After adding elements " + list);
		System.out.println(list.contains(1001));
		list.removeAll(newList);
		System.out.println(list);
		list.add(10);
		System.out.println(list);

		System.out.println("Printing all the elements of list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// sorting ArrayList
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int a = list.get(i);
				int b = list.get(j);
				if (list.get(i) >= list.get(j)) {
					list.set(i, b);
					list.set(j, a);
				}
			}
		}
		System.out.println("The ordered list is :" + list);
		
	
		
		

		/*
		 * how to sort list convert list to array convert array to list add all elements
		 * of one list to another using for loop
		 * 
		 * create a list and find the maximum and minimum element
		 */
	}
}
