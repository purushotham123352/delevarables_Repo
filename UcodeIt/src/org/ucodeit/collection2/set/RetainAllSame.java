package org.ucodeit.collection2.set;

import java.util.HashSet;

public class RetainAllSame {

	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		HashSet<String> set2=new HashSet<>();
		set2.add("one");
		set2.add("two");
		set2.add("five");
		set2.add("six");
		set2.retainAll(set2);
		System.out.println("After retaining");
		System.out.println(set1);
		/*for (String string : set1) {
			System.out.print(string+" ");
			
		}*/
	}

}
