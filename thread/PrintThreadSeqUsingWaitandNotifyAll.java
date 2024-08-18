package thread;

class PrintThreadSeqUsingWaitandNotifyAll {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber(3, 10);

        Thread t1 = new Thread(new SequenceWorker(printNumber, 1), "Thread1");
        Thread t2 = new Thread(new SequenceWorker(printNumber, 2), "Thread2");
        Thread t3 = new Thread(new SequenceWorker(printNumber, 0), "Thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class SequenceWorker implements Runnable {
    PrintNumber printNumber;
    int rem;

    SequenceWorker(PrintNumber printNumber, int rem) {
        this.printNumber = printNumber;
        this.rem = rem;
    }

    @Override
    public void run() {
        printNumber.printNumber(rem);
    }
}

class PrintNumber {
    int number = 1;
    int noOfThreads;
    int totalSequence;

    PrintNumber(int noOfThreads, int totalSequence) {
        this.noOfThreads = noOfThreads;
        this.totalSequence = totalSequence;
    }

    public void printNumber(int rem) {
        synchronized (this) {
            while (number < totalSequence - (noOfThreads - 2)) {
                while (number % noOfThreads != rem) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                notifyAll();
            }
        }

    }
}
