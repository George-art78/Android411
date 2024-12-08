package HomeWorks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork18and19 {
    public static void main(String[] args) {
//        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru";
//
//        String pattern = "[А-я-.0-9]*\\w+\\-*[.]*[\\d+]*[^,]*@\\w+[.]\\w+[.]?\\w+";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 7 (499) 456-45-78";

        String pattern = "[+]?7\\s?\\(?\\d+\\)?\\s?\\d+-?\\s?\\d+-?\\s?\\d+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
