package LESSONS;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static java.lang.Math.round;

public class CodeWars {

    public static int min(int[] list){
        Integer[] list1 = new Integer[list.length];
        for(int i = 0; i<list.length; i++){
            list1[i] = list[i];
        }
        Arrays.sort(list1, Collections.reverseOrder());
        return list[0];
    }
    public static int max(int[] list){
        Arrays.sort(list);
        return list[0];
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] res = new int[2];
        int resEven = 0;
        int resOdd = 0;
        for(int d : input){
            if(d%2==0)
                resEven += d;
            else resOdd += d;
        }
        res[0] = resEven;
        res[1] = resOdd;
        return res;
    }

    public static String checkAge(int age){
        String securityAnswer = "";
        securityAnswer = (age >= 18) ?  "You may come in" :  "Enter is forbidden";
        return securityAnswer;
    }
    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().toArray();
    }

    public static void main(String[] args) {
       int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int manAge = 18;
        System.out.println(checkAge(manAge));
        String n = "96000";
    }

}
