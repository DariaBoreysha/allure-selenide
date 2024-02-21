package LESSONS;

public class Regex {


    public static void main(String[] args) {
        String url = "http://www.google.com";
        String mail = "tim@yandex.ru";

        String urlRegex = "http://www\\..+\\.(com|ru)";

        System.out.println(mail.matches("[A-Za-z0-9!%_.#-]{1,235}@[a-zA-Z]+\\.[a-zA-Z]{2,}"));
    }


}
