package com.git.thread;

import java.util.concurrent.CountDownLatch;

public class ThreadSequence {
 private static CountDownLatch latch=new CountDownLatch(10);
	public static void main(String[] args) {
		Thread t1=new Thread(new Worker(0, latch));
		Thread t2=new Thread(new Worker(1, latch));
		Thread t3=new Thread(new Worker(2, latch));
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
