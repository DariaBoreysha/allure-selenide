package org.example.Other.Lessons;

public class Test1 {
    String name;
    int course;
    static int count;
    final static double pi = 3.14;

    public Test1(String name1, int course1) {
        count++;
        name = name1;
        course = course1;
        System.out.println("Student #" + count + " is registered!");
    }

    public static int multipl(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    public static void div(int a, int b) {
        int result = a / b;
        System.out.println("The result is: " + result);
    }

    public double squareC(int radius) {
        double square = radius * pi * radius;
        return square;
    }

    public static double length(int radius) {
        double circLeng = 2 * pi * radius;
        return circLeng;
    }

    public void showAll(int radius){
        System.out.println(radius);
        System.out.println(squareC(radius));
        System.out.println(length(radius));
    }
}
