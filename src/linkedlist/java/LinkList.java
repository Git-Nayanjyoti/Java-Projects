package linkedlist.java;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(101);
		System.out.println(list);
		list.addFirst(501);
		list.addLast(1001);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
