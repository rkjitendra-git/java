package thread;

import java.util.concurrent.CountDownLatch;


 class Worker implements Runnable{

	private int rem;
	private CountDownLatch latch;

	private static volatile int number=0;
	private int noOfseq=10;

	public Worker(int rem,CountDownLatch latch) {
		this.rem=rem;
		this.latch=latch;
	}

	@Override
	public void run() {
		while(number< noOfseq-2) {
			synchronized (latch) {
				if (number%3==rem) {
					System.out.println(Thread.currentThread().getName() +" "+(number+1));
					number++;
					latch.countDown();
				}
			}
		}

	}

}
public class PrintThreadSeqUsingLatch {
 private static CountDownLatch latch=new CountDownLatch(10);
	public static void main(String[] args) {
		Thread t1=new Thread(new Worker(0, latch),"Thread1");
		Thread t2=new Thread(new Worker(1, latch),"Thread2");
		Thread t3=new Thread(new Worker(2, latch),"Thread3");
		
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
