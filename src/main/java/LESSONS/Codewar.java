package LESSONS;

import java.util.*;
import java.util.regex.Pattern;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class Codewar {

    public static int quadrant(int x, int y) {
        if (x < 0)
            return y < 0 ? 3 : 2;
        else return y < 0 ? 4 : 1;
    }

    public static int quarterOf(int month) {
        if (1 <= month && month <= 3) return 1;
        else if (4 <= month && month <= 6) return 2;
        else if (7 <= month && month <= 9) return 3;
        else return 4;
    }

    public static String warnTheSheep(String[] array) {
        String res = null;
        int backOrder = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "wolf" && i != array.length - 1) {
                res = "Oi! Sheep number " + (array.length - i - 1) + "! You are about to be eaten by a wolf!";
            } else if (array[i] == "wolf" && i == array.length - 1) {
                res = "Pls go away and stop eating my sheep";
            }
        }
        return res;
    }

    public static int pillars(int numPill, int dist, int width) {
        if (numPill != 1)
            return (numPill * width) - (2 * width) + ((numPill - 1) * dist * 100);
        else return 0;
    }

    public static int TwiceAsOld(int dadYears, int sonYears) {
        int result = 0;
        int doubleSonYears = (sonYears * 2);
        if (doubleSonYears < dadYears) {
            result = dadYears - doubleSonYears;
        } else {
            result = doubleSonYears - dadYears;
        }
        return result;
    }

    public static int points(String[] games) {
        int score = 0;
        for (int i = 0; i < games.length; i++) {
            Integer x = Integer.valueOf(games[i].charAt(0));
            Integer y = Integer.valueOf(games[i].charAt(2));
            if (x > y) score += 3;
            else if (x.equals(y)) score += 1;
        }
        return score;
    }

    private static int[] reverseArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
        }
        return arr;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if ((nums[i] + nums[j]) == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static int romanToInt(String str) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int res = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int s1 = romanValues.get(str.charAt(i));
            if (i < str.length() - 1 && s1 < romanValues.get(str.charAt(i + 1)))
                res -= s1;
            else res += s1;
        }
        return res;
    }


    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int idx = 0;
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx))
                idx++;
            else break;
        }
        return s1.substring(0, idx);
    }

    static int findTheSmallestNum(int[] nums) {
        int smallestNum = nums[0];
        int idx = 1;
        while (idx < nums.length) {
            if (smallestNum > nums[idx]) {
                smallestNum = nums[idx];
            }
            idx++;
        }
        return smallestNum;
    }

    static int findTheSmallestNum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = a;
        if (a > b) {
            if (b > c)
                res = c;
            else res = b;
        } else {
            if (a > c)
                res = c;
            else res = a;
        }
        System.out.printf("Наименьшее из трех чисел: %d, %d, %d?", a, b, c);
        System.out.println();
        return res;
    }

    static String watermelonCut(int w) {
        if (w % 2 == 0)
            return "YES";
        else return "NO";
    }

    static void fun() {
        String s1 = " Собеседование на  джависта очень и очень страшное ! ";
        String[] s2 = s1.trim().replaceAll("\\s{2,}", " ").split(" ");
        for (String word : s2) {
            System.out.println(word);
        }
    }

    public static void countingSheep(int num) {
        int[] nums = new int[num];
        int idx = 0;
        for (int j = 1; j <= nums.length; j++) {
            nums[idx] = j;
            System.out.printf("%d sheep...", j);
            idx++;
        }
    }

    public static boolean containDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }

    public static boolean feast(String beast, String dish) {

        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1))
            return true;
        else return false;

    }

    public static int[] multipleOfIndex(int[] array) {
        int d = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] % i == 0)
                d += 1;
            else if (i == 0 && array[i] == 0)
                d += 1;
        }
        int[] array2 = new int[d];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] % i == 0) {
                array2[idx] = array[i];
                idx++;
            } else if (i == 0 && array[i] == 0)
                array2[0] = array[0];
        }
        return array2;
    }

    public static String toCsvText(int[][] array) {
        String csv = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                csv += array[i][j];
                if(j!=array[i].length-1)
                csv += ",";
            }
            if(i!=array.length-1)
                csv += "\n";
        }
        csv = csv.substring(4);
        return csv;
    }
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int summ = 0;
        for(int i : arr1){
            summ+=i;
        }
        for(int a : arr2){
            summ+=a;
        }
        return summ;
    }
    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }

    public static void main(String[] args) {
        List<String> textbooks= new ArrayList<>();
        textbooks.add("Algebra");
        textbooks.add("History");
        textbooks.add("Geometry");
        textbooks.add("english");
        System.out.println(sort(textbooks));

    }
}

