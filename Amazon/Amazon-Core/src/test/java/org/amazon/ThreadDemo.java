package org.amazon;

public class ThreadDemo implements Runnable{
    int MAX=20;
    static int  counter = 1;
    int rem;
    static Object lock = new Object();
    // parameterized constructor
    ThreadDemo(int rem)
    {
        this.rem = rem;
    }
    // override run() method
    @Override
    public void run() {
        // use while loop to recursively execute steps until counter < MAX
        while (counter < MAX) {
            // synchronized block
            synchronized (lock) {
                while (counter % 2 != rem) { // wait for numbers other than remainder
                    // use try-catch block to put lock in waiting state
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                //increment counter
                counter++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo(0);
        ThreadDemo threadDemo2 = new ThreadDemo(1);
        Thread thread1 = new Thread(threadDemo1);
        Thread thread2 = new Thread(threadDemo2);
        thread1.start();
        thread2.start();


    }

}
