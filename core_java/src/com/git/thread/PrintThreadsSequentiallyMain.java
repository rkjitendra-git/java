package com.git.thread;
public class PrintThreadsSequentiallyMain {
 
    public static void main(String[] args) {
 
    	PrintThread runnable1=new PrintThread(0);
    	PrintThread runnable2=new PrintThread(1);
    	PrintThread runnable3=new PrintThread(2);
 
        Thread t1=new Thread(runnable1,"T0");
        Thread t2=new Thread(runnable2,"T1");
        Thread t3=new Thread(runnable3,"T2");
 
        t1.start();
        t2.start();
        t3.start();   
    }
}