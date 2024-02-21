package LESSONS;

import java.util.Scanner;

public class Threads {


    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        while (result) {
            if (scanner.nextLine().matches("1"))
                result = false;
        }
        thread1.shutdown();

    }
}

class MyThread extends Thread {
    private volatile boolean running = true;


    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}
