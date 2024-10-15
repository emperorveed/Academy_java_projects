package com.bptn.course._19_multithreading;


class MyThread extends Thread{
	
	
	
	MyThread(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		System.out.println("Running: " + this.getName() + " - " + this.getState());
		
		for(int i=0; i<10; i++) {
			System.out.println("Running: " + this.getName() + " - " + this.getState() + " - " + i);
			
			try {
				Thread.sleep(400); /*The thread sleeps for 400ms */
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Exiting: " + this.getName() + " - " + this.getState());
	}
}


public class ThreadExample {
	


	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
		
		MyThread t1 = new MyThread("T-1");
		System.out.println("Running: " + t1.getName() + " - " + t1.getState());
		
		MyThread t2 = new MyThread("T-2");
		System.out.println("Running: " + t2.getName() + " - " + t2.getState());
		
		t1.run();
		t2.run();
		
		
		t1.join();
		t2.join();
		System.out.println("Ending: " + t1.getName() + " - " + t1.getState());
		System.out.println("Ending: " + t2.getName() + " - " + t2.getState());

	}

}
