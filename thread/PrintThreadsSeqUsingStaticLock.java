package thread;

class PrintThread implements Runnable {
    public int numberUpto = 10;
    static int num = 1;
    int remainder;
    static Object lock = new Object();

    public PrintThread(int remainder) {
        this.remainder = remainder;
    }
    @Override
    public void run() {
        while (num < numberUpto - 1) {
            synchronized (lock) {
                while (num % 3 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + num);
                num++;
                lock.notifyAll();
            }
        }
    }
}

 class PrintThreadsSeqUsingStaticLock {
    public static void main(String[] args) {
    	PrintThread runnable1=new PrintThread(1);
    	PrintThread runnable2=new PrintThread(2);
    	PrintThread runnable3=new PrintThread(0);
 
        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");
 
        t1.start();
        t2.start();
        t3.start();   
    }
}