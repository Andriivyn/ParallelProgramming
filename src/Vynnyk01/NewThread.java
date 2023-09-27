package Vynnyk01;

public class NewThread extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("a: " + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        NewThread myThread = new NewThread();

        myThread.start();
    }
}
