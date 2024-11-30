package lessons7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "Я ищу совпадения в 2024. И я их найду в 2 счёта. 5910. Hel_lo. Ели[-ели]";
//        String pattern = "[12][0-9][0-9][0-9]";
//        String pattern = "[А-яЁё]";
//        String pattern = "[А-яЁё\\[\\]-]";
        String pattern = "[^0-9]"; // поиск всего, что не входит в указанный диапазон
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
//        System.out.println(matcher.find());
        while (matcher.find()) {
//            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1));
//            System.out.println(s.substring(matcher.start(), matcher.end()));
            System.out.print(matcher.group());
        }
    }
}
