package com.bptn.course._25_MultiThreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());

		t1.start();
		t2.start();

	}
}