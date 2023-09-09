package org.ucodeit.collection2.set;

import java.util.HashSet;
import java.util.Iterator;

public class CreatesetIterate {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("red");
		set.add("green");

		set.add("blue");

		set.add("yellow");
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}


	}

}
