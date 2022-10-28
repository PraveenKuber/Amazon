package arrays;

public class ThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.printf("Printed::::::::::::::");
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.run();


    }
}
