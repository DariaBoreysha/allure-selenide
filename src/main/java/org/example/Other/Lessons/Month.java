package org.example.Other.Lessons;

public class Month {

/*    public Month() {
    }*/

    public static void daysQuantity(int month){
        System.out.print("Number of days: ");
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("No such month");
        }
    }
}
