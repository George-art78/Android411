package lessons7;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String s = "Я ищу совпадения в 2024. И я их найду в 2 счёта. 5910. Hel_lo World. Ели[-ели]";
//        String s = "one\ntwo";
//        String s = "Java, \njava, \nJAVA";
//        String s = "<body>Пример жадного соответствия регулярных выражений</body>";
//        String pattern = "[12][0-9][0-9][0-9]";
//        String pattern = "[А-яЁё]";
//        String pattern = "[А-яЁё\\[\\]-]";
//        String pattern = "\\d+ #поиск цифр"; // поиск всего, что не входит в указанный диапазон
//        String pattern = "one.\\w+";
//        String pattern = "one$";
//        String pattern = "(?im)^java";
//        String s = "Егорова Алиса Александровна";
//        String s = "Word2016, PS6, AI5";
//        String s = "one";
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите дату в формате dd-mm-YYYY: ");
////        String s = input.nextLine();
//////        String pattern = "([a-z]+)(\\d*)";
//////        String pattern = "(.(.(.)))";
//////        String pattern = "Петр|Ольга|Виталий";
//////        String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
//////        String pattern = "(\\d{1,3}.){3}\\d{1,3}";
////        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
//////        String pattern = "A.+a";
//////        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // поиск загравных букв + игнор языка
//////        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
//////        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE);
////        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
////        Matcher matcher = regex.matcher(s);
//////        System.out.println(matcher.find());
////        while (matcher.find()) {
////////            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1));
////////            System.out.println(s.substring(matcher.start(), matcher.end()));
////            System.out.println(matcher.group());
////        }

//        matcher.find();
//        System.out.println(matcher.groupCount());
//        for (int i = 0; i <= matcher.groupCount(); i++) {
//            System.out.println(i + ": " + matcher.group(i));
//        }

//        String s = "Я ищу совпадения в 2024. И я их найду в 2 счёта. 5910. Hel_lo World. Ели[-ели].";
//        String s = "Суворова Виктория, Россия, г. Сочи, +7 999 555-77-33";
        String s = "05-03-1987 // Дата рождения";
        String s2 = s.replaceAll("\\s//.*", "").replaceAll("-", ".");
        System.out.println("Дата рождения: " + s2);
//        String[] arr = s.split("\\.");
//        String[] arr = s.split(",\\s");
//        for (String temp : arr) {
//            System.out.println(temp);
//        }


    }
}
