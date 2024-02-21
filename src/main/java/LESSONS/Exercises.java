package LESSONS;

import com.github.javafaker.Faker;

import java.util.*;

public class Exercises {


    public void factorial(int a){
        int res = 1;
        for(int i = 1; i<=a; i++){
            res = res*i;
        }
        System.out.println(res);
    }

    public void simpleNum(int num){
        boolean isPrime = true;
        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println("The number is Prime: " + isPrime);
    }

    public void invertArray(int[] array){
        int length = array.length;
        int temp;
        for (int i = 0; i<length/2; i++){
            temp = array[i];
            array[i] = array[length - i -1];
            array[length - i -1] = temp;
        }
    }

    

    public static void main(String[] args) {
        Exercises e = new Exercises();
        Random random = new Random();
        Faker faker = new Faker();

      /*  Map<String, Integer> dictionary = new HashMap<>();
        dictionary.put("Анна", 25);
        dictionary.put("Петр", 32);
        dictionary.put("Мария", 18);
        dictionary.put("Иван", 40);
        dictionary.put("Елена", 28);

        //dictionary.entrySet().stream().forEach(System.out::println);

        List<Map.Entry<String, Integer>> sortedAscending = new ArrayList<>(dictionary.entrySet());
        Collections.sort(sortedAscending, Comparator.comparing(Map.Entry::getValue));
        for(Map.Entry<String, Integer> entry : sortedAscending){
            System.out.println(entry);
        }

        System.out.println();
        List<Map.Entry<String, Integer>> sortedDescending = new ArrayList<>(dictionary.entrySet());
        Collections.sort(sortedDescending, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for(Map.Entry<String, Integer> entry : sortedDescending){
            System.out.println(entry);
        }*/

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list.get(0));
    }


}
