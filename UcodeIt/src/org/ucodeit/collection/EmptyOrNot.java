package org.ucodeit.collection;

import java.util.ArrayList;
import java.util.List;

public class EmptyOrNot {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("Arrat List is Empty or not "+list.isEmpty());
		list.removeAll(list);
		System.out.println("Arrat List is Empty or not "+list.isEmpty());
	}

}
