package LESSONS;

public class Synchronized {
    private int counter;

    public void increment() {
        synchronized (this) {
            counter++;
        }

    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Synchronized sync = new Synchronized();
        sync.doWork();
    }
}
