package org.amazon;

public class InterthreadCommunication implements Runnable{
    private static int counter = 1;
    private int MAX = 20;
    private int rem;
    private static Object lock = new Object();

    public InterthreadCommunication(int rem){
        this.rem=rem;
    }


    @Override
    public void run() {
        while(counter<=MAX){
            synchronized (lock){
                while(counter%2==rem){
                    try {
                        lock.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                counter++;
                System.out.println("ThreadName:::"+Thread.currentThread().getName()+"::: Count::"+counter);
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new InterthreadCommunication(0));
        Thread thread2 = new Thread(new InterthreadCommunication(1));
        thread1.start();
        thread2.start();

    }
}
