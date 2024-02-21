package LESSONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Synchronized2 {


    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    Object lock1 = new Object();
    Object lock2 = new Object();

    public void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }

    }

    public void work() {
        for (int i = 0; i < 100; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> work());

        Thread thread2 = new Thread(() -> work());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();
        System.out.println("It took: " + (after - before) + " ms to perform");
        System.out.println(list1.size());
        System.out.println(list2.size());

    }
}
