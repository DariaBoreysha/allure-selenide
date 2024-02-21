package LESSONS;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    private static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(10);


    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();
        Thread thread1 = new Thread(() -> {
            try {
                wn.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                wn.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        thread2.join();
        thread1.join();


    }


}

class WaitAndNotify {
    public void consume() throws InterruptedException {
        synchronized (this){
            System.out.println("Consumer thread started...");
            Thread.sleep(10000);
            wait();
            System.out.println("Consumer thread resumed...");
        }
    }

    public void produce() throws InterruptedException {
            System.out.println("Producer thread started...");

            Thread.sleep(1000);
            Scanner scanner = new Scanner(System.in);
            synchronized (this){
                System.out.println("Waiting for return key...");
                scanner.nextLine();
                notify();

            }

    }
}

   /* private static void consume() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(500);
                if (random.nextInt(10) == 5) {
                    System.out.println(blockingQueue.take());
                    System.out.println("The size of queue is: " + blockingQueue.size());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void produce() {
        Random random = new Random();
        while (true) {
            try {
                blockingQueue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/