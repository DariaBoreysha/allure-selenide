package LESSONS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i<5; i++)
            executorService.submit(new Work(i));

        executorService.shutdown();
        System.out.println("All tasks submitted");

        try {
          executorService.awaitTermination(5, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class Work implements  Runnable{
    private int id;

    Work(int id){
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Work with id: %d is successfully started", id);
        System.out.println();
    }
}
