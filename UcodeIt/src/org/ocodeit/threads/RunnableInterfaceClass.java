package org.ocodeit.threads;

public class RunnableInterfaceClass implements Runnable {

	public static void main(String[] args) {
		RunnableInterfaceClass rt=new RunnableInterfaceClass();
		RunnableInterfaceClass rt1=new RunnableInterfaceClass();
		Thread th=new Thread(rt);
		Thread th1=new Thread(rt1);
		th.start();
		th1.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("["+Thread.currentThread().getName()+" "+i+"]");
			try {
				Thread.sleep(200);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
