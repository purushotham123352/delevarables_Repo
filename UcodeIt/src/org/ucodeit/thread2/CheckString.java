package org.ucodeit.thread2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CheckString {

	public static void main(String[] args) {
		CompletableFuture<Void> future=CompletableFuture.supplyAsync(()->{
			List<String> list=Arrays.asList("julie","john","bob");
			return list;
		}).thenAccept(list->{
			if(list.contains("john")) {
				System.out.println("Equal Found"); 
			}
			else {
				System.out.println("john not Found"); 
			}
		});

	}

}
