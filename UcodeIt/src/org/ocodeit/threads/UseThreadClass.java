package org.ocodeit.threads;

public class UseThreadClass extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

	public static void main(String[] args) {
		UseThreadClass th1=new UseThreadClass();
		UseThreadClass th2=new UseThreadClass();
		th1.start();
		th2.start();
	}

}
