package com.bptn.course._19_multithreading;


class NewThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
		
		for(int i=0; i<10; i++) {
			System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState() + " - " + i);
			
			try {
				Thread.sleep(400); /*The thread sleeps for 400ms */
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Exiting: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
	}
}


public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
		
		NewThread r1 = new NewThread();
		Thread t1 = new Thread(r1, "T-1");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Running: " + t1.getName() + " - " + t1.getState());
		
		NewThread r2 = new NewThread();
		Thread t2 = new Thread(r2, "T-2");
		
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Running: " + t2.getName() + " - " + t2.getState());
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		System.out.println("Ending: " + t1.getName() + " - " + t1.getState());
		System.out.println("Ending: " + t2.getName() + " - " + t2.getState());


	}

}
