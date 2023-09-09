package org.ucodeit.collection;

import java.util.LinkedList;

public class AppendList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println("Before append");
		for (String string : list) {
			System.out.print(string+" ");
		}
		System.out.println();
		list.addLast("four");
		System.out.println("After append");
		for (String string : list) {
			System.out.print(string+" ");
		}
				}

}
