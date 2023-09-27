package Vynnyk01;

public class ThreadSleepExample implements Runnable {
    public void run() {
        for (int x = 1; x < 4; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}

class SleepRunnableDemo {
    public static void main(String[] args) {
        ThreadSleepExample sleepRunnable = new ThreadSleepExample();

        Thread one = new Thread(sleepRunnable);
        one.setName("Fred");
        Thread two = new Thread(sleepRunnable);
        two.setName("Lucy");
        Thread three = new Thread(sleepRunnable);
        three.setName("Ricky");

        one.start();
        two.start();
        three.start();
    }
}
