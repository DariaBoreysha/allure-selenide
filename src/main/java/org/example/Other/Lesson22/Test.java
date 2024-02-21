package org.example.Other.Lesson22;

import java.util.ArrayList;

public class Test {

    /*    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        ArrayList<Boolean> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        int wtf = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == true) {
                wtf += 1;
            }
        }
        boolean bool = wtf == 2 ? true : false;
        System.out.println(bool);
        return bool;*/
    public static int leapYearCount(int year) {
        int answer = 0;
        for (int i = 1; i <= year; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                answer += 1;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        //booleanExpression(false,false,true,false);
        leapYearCount(100);

        for (double i = 0.1; i < 2; i += 0.1)
            System.out.println(i);
        Object o = 0x0bp3;
        System.out.println(o.getClass());
    }
}