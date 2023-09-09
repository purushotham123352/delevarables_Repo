package org.ucodeit.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		Iterator i=list.listIterator(0);
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
