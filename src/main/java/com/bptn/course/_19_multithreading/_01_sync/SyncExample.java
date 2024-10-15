package com.bptn.course._19_multithreading._01_sync;

import java.util.ArrayList;
import java.util.List;


class MyThread extends Thread{
	
	List<Integer> list;
	
	MyThread(String name, List<Integer> list) {
		super(name);
		this.list = list;
		
	}

	@Override
	public void run() {
		System.out.println("Running: " + this.getName() + " - " + this.getState());
		
		//int max = inserNextId();
		synchronized(list) {
			inserNextId();
		}
		
		
		System.out.println("Exiting: " + this.getName() + " - " + this.getState());
	}
	
	private void inserNextId() {
		int max = 0;
		for(int num: list) {
			if(num>max) {
				max = num;
			}
		}
		this.list.add(++max);
	}
}



public class SyncExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
		
		List<Integer> list = new ArrayList<>(List.of(5,1,4,3,6,2));
		
		MyThread t1 = new MyThread("T-1", list);
		System.out.println("Running: " + t1.getName() + " - " + t1.getState());
		
		MyThread t2 = new MyThread("T-2", list);
		System.out.println("Running: " + t2.getName() + " - " + t2.getState());
		
		System.out.println("List Before " + list);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("List After " + list);
		
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());

	}

}
