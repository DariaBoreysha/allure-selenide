package LESSONS;

public class Multithreading extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main class thread: " + i);
        }
    }
    public static String replaceDots(String str) {
        return str.replace(".", "-");
    }

    public static String multiTable(int num) {
        String res = "";
        String number = "0";
        for (int i = 1; i <= 10; i++) {
            number = String.valueOf(i * num);
            res += i + " * " + num + " = " + number + "\n";
        }
        res = res.trim();
        return res;
    }



    public static void main(String[] args) {
        System.out.println(replaceDots("one-two-three"));
    }

}


class NewThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("NewThread class thread: " + i);
        }
    }
}
