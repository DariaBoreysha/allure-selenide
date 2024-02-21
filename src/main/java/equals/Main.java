package equals;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker(1, "Dima");
        Worker worker2 = new Worker(1, "Dima");

        System.out.println(worker1.equals(worker2));

    }
}
