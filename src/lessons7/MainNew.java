package lessons7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainNew {
    public static void main(String[] args) {
        String s = "Я ищу совпадения в 2024. И я их найду в 2 счёта. 5910. Hel_lo World. Ели[-ели]";
//        String pattern = "\\."; // точка - служебный символ, любой символ, кроме переноса на новую строку
//        String pattern = "\\d"; // одна любая цифра
//        String pattern = "\\s"; // поиск пробельных символов
//        String pattern = "\\w"; // аналог [A-Za-z0-9_], игнорирует русский язык
//        String pattern = "\\D"; // поиск чего угодно, КРОМЕ цифр, аналог [^0-9]
//        String pattern = "\\S"; // поиск чего угодно, КРОМЕ пробелов
//        String pattern = "\\W"; // поиск чего угодно, КРОМЕ [A-Za-z0-9_]
//        String pattern = "\\AЯ ищу"; // поиск с начала строки
//        String pattern = "Ели\\[-ели\\].\\Z"; // поиск с конца строки
//        String pattern = "\\Bсовпадения"; // поиск с привязкой к началу символа
//        String pattern = "\\w+"; // поиск нескольких символов ПОДРЯД производится через "+": ОТ одного символа
        String pattern = "20*";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()) { // позволяет в цикле вывести ВСЕ совпадения в строке. Без цикла выводит только ПЕРВОЕ совпадение
            System.out.print(matcher.group() + " ");
        }
    }
}

//количество повторений:
// + - от 1 до бесконечности
// * - от 0 до бесконечности
// ? - от 0 до 1