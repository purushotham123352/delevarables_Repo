package org.ucodeit.thread2;

import java.util.concurrent.CompletableFuture;

public class PrintHelloWorldUsingCompletable {

	public static void main(String[] args) {
		CompletableFuture<Void> supplyAsync=CompletableFuture.supplyAsync(()->{
			return "Hello World";
		}).thenAccept(message->{
			System.out.println(message);
		});
       supplyAsync.join();
	}

}
