package org.amazon;

/*
*  //Display number from one to 1
*
* */


public class ThreadTest implements Runnable{
    int count;

    public ThreadTest(int count){
        this.count=count;
    }

    @Override
    public void run() {
       for(int i=0;i<count;i++){
           System.out.println("Number:::"+i);
       }
    }

    public static void main(String[] args) {
        ThreadTest threadTest1 = new ThreadTest(10);
        Thread thread1 = new Thread(threadTest1);
        thread1.start();
    }

}
