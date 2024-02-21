package LESSONS;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        Faker faker = new Faker();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(faker.color().name());
        }

        String[] arr = list.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

    }


}
