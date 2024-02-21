package LESSONS;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WordComparator {

    public static boolean checkWords(String word1, String word2) {
        boolean result = true;
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++)
                if (word1.charAt(i) == word2.charAt(i)) {
                } else {
                    result = false;
                }
        } else {
            result = false;
        }
        return result;
    }

    public static boolean isPalindrome(String word1) {
        String word = word1.toLowerCase();
        int i = 0;
        int j = word.length() - 1;
        boolean res = true;
        for (int a = 0; a < word.length(); a++) {
            if (word.charAt(i) == word.charAt(j)){
                i++;
                j--;
            }else{
                res = false;
            }
        }
        return res;
    }

    static Comparator<String> wordLegthComparator = (String s1, String s2) -> {
        if(s1.length() > s2.length()) return 1;
        else if (s1.length() < s2.length()) return -1;
        else return 0;
    };

    public static void main(String[] args) {
        String a = "Шалаш";
        System.out.println(isPalindrome(a));
        List<String> words = new ArrayList<>();
        Faker faker = new Faker();
        for(int i = 0; i<10; i++){
            words.add(faker.color().name());
        }
        System.out.println(words);
        words.sort(Comparator.naturalOrder());
        System.out.println(words);
    }
}

