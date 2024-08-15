package com.git.thread;

public class PrintThread implements Runnable{
public int numberUpto=10;
static int num=1;
int remainder;
public PrintThread(int remainder) {
	this.remainder=remainder;
}
static Object lock=new Object();
	@Override
	public void run() {
		while(num<numberUpto-1) {
			synchronized (lock) {
				
			
			while(num%3==remainder)
			{
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
			 System.out.println(Thread.currentThread().getName() + " " + num);
			 
			 num++;
             lock.notify();
		  }
		}
		
		
	}

}
