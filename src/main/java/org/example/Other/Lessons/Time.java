package org.example.Other.Lessons;

public class Time {

    public static void timeDisplay() {
        OUTER:
        for (int h = 0; h < 6; h++) {
            MIDDLE:
            for (int m = 0; m < 60; m++) {
                if ((h > 1) && (m % 10 == 0))
                    break OUTER;
                INNER:
                for (int s = 0; s < 60; s++) {
                    if (s * h > m) {
                        continue MIDDLE;
                    }
                    System.out.println(h + ":" + m + ":" + s);
                }
            }
        }



    }
}
