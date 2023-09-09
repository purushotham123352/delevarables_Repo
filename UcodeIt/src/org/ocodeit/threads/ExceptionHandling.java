package org.ocodeit.threads;

public class ExceptionHandling extends Thread{

	public static void main(String[] args) {
		System.out.println("Main thread execution start");
		Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Exception handled "+t.getName());
				
			}
		});
		ExceptionHandling ex=new ExceptionHandling();
		ex.start();
		System.out.println("Main thread executed");
	}
	public void run() {
		throw new RuntimeException();
	}

}
