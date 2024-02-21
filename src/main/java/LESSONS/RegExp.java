package LESSONS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static void main(String[] args) {
        String s1 = "12345@mail.ru";
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.[A-Za-z]{2,4}");


//, 23, abcd, "What", 12345@mail.com, 12345@mail.by, 123123@asd.yahoo
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()){
            System.out.println("Position: " + matcher.start()+ " " + matcher.group());
            System.out.println(matcher.matches());
        }
    }


}
