//java program to remove duplicate
package list.java;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		// creating an arraylist with string datatypes.
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("G");
		System.out.println("The list with duplicate values:" + list);
		//calling the removeduplicate method with parameter list.
		removeduplicate(list);
	}

	@SuppressWarnings("rawtypes")
	// method to removeduplicate from arraylist.
	static void removeduplicate(ArrayList list) {
		for (int i = 0; i < list.size() - 1; i++) 
		{
			for (int j = i + 1; j < list.size(); j++) 
			{
				if (list.get(i) == list.get(j)) 
				{
					list.remove(j);
				}
			}
		}
		System.out.println("The list after removing duplicate is :" + list);

	}

}
