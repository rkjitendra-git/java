package com.git.thread;
import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{
	
	private int rem;
	private CountDownLatch latch;
	
	private static volatile int count=0;
	private int limit=10;
	
	public Worker(int rem,CountDownLatch latch) {
		this.rem=rem;
		this.latch=latch;
	}

	@Override
	public void run() {
		while(count< limit) {
			synchronized (latch) {
				if (count%3==rem) {
					System.out.println("Thread " + rem +" :" +(count));
					
					
					count++;
					latch.countDown();
				}
				
			}
			
		}
		
	}
	
}