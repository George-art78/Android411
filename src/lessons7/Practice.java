package lessons7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Practice {
    public static void main(String[] args) {
        try {
//            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15T21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15T01:09.";
//            String s = "Цифры: 7, +17, -42, 0013, 0.3";
//            String s = "author=Пушкин А.С.; title  = Евгений Онегин; price =200; year= 1831";
//            String s = "12 сентября 2024 года";
//            String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 74994564578";
//            String s = "I learning Java Hello";
            String s = "Java_master!@#";
//            String pattern = "[0-2][0-9]:[0-5][0-9";
//            String pattern = "[+-]?[\\d.]+";
//            String pattern = "\\w+\\s*=\\s*[А-я0-9 .]+"; // в квадратных скобках точка ищется как символ, а не как метасимвол
//            String pattern = "\\w+\\s*=\\s*[^;]+"; // в квадратных скобках точка ищется как символ, а не как метасимвол
//            String pattern = "\\d{2,4}"; // в фигурных скобках указывается количество повторений, идущих подряд, аналог "+", "*" и "?", только с нашим количеством повторений. Можно указать интервал повторений: от 2 до 4
//            String pattern = "[+]?7\\d{10}"; // 7 перед \\d показывает, что должно начинаться именно с 7
//            String pattern = "^\\w+\\s\\w+"; // ^ без [] значит, что совпадение должно быть с начала строки. Другие совпадения браться не будут
//            String pattern = "\\w+\\s\\w+$"; // $ - проверка совпадений с конца строки
//            String pattern = "^\\w+\\s\\w+\\s\\w+\\s\\w+$"; // ^ и $ используются для исключения всех лишних символов из строки
            String pattern = "^[\\w-]{3,16}$";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException pse) { // обычно исключениям дают псевдоним (после указания исключения) по первым буквам исключения
            System.out.println("Неправильное регулярное выражение: " + pse.getMessage()); // метод getMessage вывод текст исключения
            System.out.println("Описание: " + pse.getDescription()); // метод пояснения, что не так
            System.out.println("Позиция: " + pse.getIndex()); // показывает позицию/индекс, где произошла ошибка
            System.out.println("Неправильный шаблон: " + pse.getPattern()); // показывает сам шаблон
        }

    }
}

