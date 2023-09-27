package Vynnyk01;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Runner " + Thread.currentThread().getName() + "; i= " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MainRunner {
    public static void main(String[] args) {
        MyRunnable runner = new MyRunnable();

        Thread one = new Thread(runner);
        one.setName("One");
        Thread two = new Thread(runner);
        two.setName("Two");
        Thread three = new Thread(runner);
        three.setName("Three");

        one.start();
        two.start();
        three.start();

    }
}
