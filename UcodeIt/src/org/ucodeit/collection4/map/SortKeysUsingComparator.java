package org.ucodeit.collection4.map;

import java.util.Comparator;
import java.util.TreeMap;

public class SortKeysUsingComparator {

	public static void main(String[] args) {
		TreeMap<String, String> tree=new TreeMap<>();
		tree.put("a", "purush");
		tree.put("c", "vamsi");
		
		tree.put("b", "vishnu");
		tree.put("d", "chandu");
		System.out.println(tree);
		

	}

}
class Sort implements Comparator<String>{
	@Override
	public int compare(String s1,String s2) {
		return s1.compareTo(s2);
	}
}
