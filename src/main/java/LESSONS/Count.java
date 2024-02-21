package LESSONS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Count {


    public static boolean checkSumVSavg(List<Integer> list) {
        int summ = 0;
        for (int a : list) {
            summ = summ + a;
        }
        System.out.println("The total sum is: " + summ);
        int avg = summ / list.size();
        System.out.println("The average of the list is: " + avg);
        if (summ < avg)
            return true;
        else {
            return false;
        }
    }

   private static Comparator<Integer> intComparatorASC = (a, b) -> {
        if (a > b) return 1;
            else if (a < b) return -1;
            else return 0;
    };
    private static Comparator<Integer> intComparatorDESC = (a, b) -> {
        if (a < b) return 1;
        else if (a > b) return -1;
        else return 0;
    };

    public static void findTheSmallestElement(List<Integer> list){
        list.sort(intComparatorASC);
        System.out.println("The smallest  element is: " + list.get(0));
    }
    public static void findTheBiggestElement(List<Integer> list){
        list.sort(intComparatorDESC);
        System.out.println("The biggest element is: " + list.get(0));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        findTheBiggestElement(list);
        findTheSmallestElement(list);


    }
}
