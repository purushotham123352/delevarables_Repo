package org.ucodeit.collection;

import java.util.LinkedList;

public class checkStringinlist {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		if(list.contains("one")) {
			System.out.println("yes one it is");
		}
		else {
			System.out.println("no one is present");
		}
		if(list.contains("five")) {
			System.out.println("yes it is");
		}
		else {
			System.out.println("no five is present");
		}
	}

}
