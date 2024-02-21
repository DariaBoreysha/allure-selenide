package org.example.Other.Lessons;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {

        Faker f = new Faker();

        /* Checking not addresses but values of arrays*/
        boolean bool = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    bool = false;
                    break;
                }
            }
        } else {
            bool = false;
        }
        System.out.println(bool);
        return bool;
    }

    static void summa(int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    static void abc(String... s) {
        List<String> st = new ArrayList<>();
        for (String s1 : s) {
            if (!st.contains(s1)) {
                st.add(s1);
            }
        }
        Collections.sort(st);
        System.out.println(st);
    }




}


       /* boolean bool = (sb1 == sb2) ? true : false;
        System.out.println(bool);
        return bool;  Checks addresses to objects!!!*/
