package lesson5;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //исключения

//        try {
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//
//            System.out.println(a / b);
//        } catch (InputMismatchException e) { // е - псевдоним исключения
//            System.out.println("Вы ввели не целое число: " + e);
//        } catch (ArithmeticException e) {
//            System.out.println("Делить на 0 нельзя.");
//        }

//        try {
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//
//            System.out.println(a / b);
//        } catch (InputMismatchException | ArithmeticException e) { // е - псевдоним исключения; через | указывают несколько исключений
//            System.out.println("Вы ввели не целое число: " + e);
//            System.out.println("Делить на 0 нельзя.");
//        } finally { // finally выполняется ВСЕГДА
//            System.out.println("Конец программы.");
//        }

//        try {
//            int[] numbers = new int[3];
//            numbers[3] = 9;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Введён некорректный индекс.");
//        }

//      int res = getFactorial(-5);
//      System.out.println(res);

//        char[] helloArray = {'П', 'р', 'и', 'в', 'е', 'т'};
//        String helloString = new String(helloArray); // явное преобразование массива в строку
//        System.out.println(helloString);

//        int a = 5;
//        String message = "" + a; // наиболее простой способ преобразовать число в строку
//        System.out.println(message);

//        String str1 = "2";
//        int a = 5;
//        int b = Integer.parseInt(str1); // приведение строки в число; метод работает только при введении чисел в строке
//        int message = b + a;
//        System.out.println(message);

//        String name = "Nikita";
//        String name2 = name.toLowerCase(); // изменение регистра на нижний (работает с любой буквой)
//        System.out.println(name2);

//        String name = "Nikita";
//        String name2 = name.toUpperCase(); // изменение регистра на верхний (работает с любой буквой)
//        System.out.println(name2);

//        String s = "Я буду хорошим программистом";
//        char res = s.charAt(7); // метод для вызова элемента по заданному индексу; String неявно хранит массив данных char
//        System.out.println(res);

//        String s = "я буду хорошим программистом";
//        System.out.println(s);
//        int[] result = new int['я' - 'а' + 1];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch >= 'а' && ch <= 'я') {
//                result[ch - 'а']++;
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);
//        }

//        String s1 = "";
//        if (s1.length() == 0 || s1.isEmpty()) { // s1.isEmpty() - метод для проверки, пустая ли строка
//            System.out.println("Пустая строка");
//        }

//        String str1 = "Строка";
//        char[] res = str1.toCharArray(); // метод преобразования строки в массив символов
//
//        System.out.println("Массив символов:");
//        for (int i = 0; i < res.length; i++) {
//            System.out.println("Элемент [" + i + "]: " + res[i]);
//        }

//        String path = "https://www.oracle.com/java/technologies/downloads/#jdk20-";
//        char[] chars = path.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '/') {
//                chars[i] = '\\';
//            }
//        }
//
//        String res = new String(chars); // метод преобразования массива в строку
//        System.out.println(chars);

//        String str1 = "I learning Java";
//        System.out.println(str1);
//        System.out.println(str1.indexOf('a')); // поиск ИНДЕКСА по введённому символу. Ищет только первое совпадение и прекращается
//        System.out.println(str1.lastIndexOf('a')); // ищет последнее вхождение по символу
//        System.out.println(str1.indexOf('a', 5)); // тоже самое, что и первый метод, только цифра указывает начало поиска указанного символа

//        System.out.println("      Hello, World                         ".trim()); // удаляет все проблемы с начала и с конца строки

//        System.out.println("I learning Java".substring(2, 10)); // поиск подстроки с указанного индекса по указанный (последний не включительно)

//        System.out.print("Введите 2 слова через пробел: ");
//        String str = input.nextLine();
//
//        String first = str.substring(0, str.indexOf(" "));
//        String second = str.substring(str.indexOf(" ")).trim();
//
//        System.out.println(second + " " + first);

//        String str1 = "I learning Java";
//        String[] words = str1.split(" "); // разбитие строки на подстроки по заданному параметру или выражению
//        for (String word : words)
//            System.out.println(word);

//        System.out.print("Введите ФИО: ");
//        String str = input.nextLine();
//
//        String[] fio = str.split(" ");
//        System.out.println(Arrays.toString(fio));
//        System.out.println(fio[0] + " " + fio[1].substring(0, 1) + "." + fio[2].substring(0, 1) + ".");

//        String line = "Строка";
//        String result = "";
//        for (int i = line.length() - 1; i >= 0; i--) {
//            result += line.charAt(i);
//        }
//        System.out.println(result);

//        String res = String.join(":", "00", "23", "30"); // метод объединения через символ-объединитель
//        System.out.println(res);
//
//        String[] text = new String[]{"Я", "буду", "хорошим", "программистом"};
//        String str = String.join(" ", text);
//        System.out.println(str);

//        String text = "Я изучаю Java. Мне нравится Java.";
//        System.out.println(text);
//        String[] array = text.split("Java");
//        System.out.println(Arrays.toString(array));
//
//        String res = String.join("Android", array);
//        System.out.println( res);

//        String text = "Я изучаю Java. Мне нравится Java.";
//        text = text.replace("Java", "Android"); // метод замены символа: target - символ, который нужно заменить, replacement - символ, на который меняется первый символ
//        System.out.println(text);

//        String text = "Замените в этой строке все появления буквы 'о' на букву 'О', кроме первого и последнего вхождения";
//        String a = text.substring(0, text.indexOf('о') + 1);
//        String b = text.substring(text.indexOf('о') + 1, text.lastIndexOf('о'));
//        String c = text.substring(text.lastIndexOf('о'));
//        System.out.println(a + b.replace('о', 'О') + c);

//        String a = "Hello";
//        String b = "Hello";
//        String c = "Goodbye";
//        String d = "HELLO";
//
//        System.out.println(a + " == " + b + " -> " + a.equals(b)); // метод сравнения строк
//        System.out.println(a + " == " + c + " -> " + a.equals(c));
//        System.out.println(a + " == " + d + " -> " + a.equals(d));
//        System.out.println(a + " == " + d + " -> " + a.equalsIgnoreCase(d)); // метод сравнения строк БЕЗ УЧЁТА РЕГИСТРА

//        System.out.println("I learning Java".endsWith("Java")); // проверка символа, на который оканчивается строка
//        System.out.println("I learning Java".startsWith("Java")); // проверка символа, на который начинается строка
//        System.out.println("I learning Java".contains("ing")); // проверка последовательности символов

//        System.out.print("Введите название документа: ");
//        String path = input.nextLine();
//
//        if (path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png")) {
//            System.out.println("Это изображение");
//        } else if (path.endsWith(".html")) {
//            System.out.println("Это HTML-страница");
//        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
//            System.out.println("Это документ Word");
//        } else {
//            System.out.println("Неизвестный формат");
//        }

//        String s = "I learning Java";
//        int n;
//        n = s.codePointAt(0); // возвращает код символа по указанному индексу
//        System.out.println(n);
//        n = s.codePointBefore(3); // возвращает код предыдущего элемента от указанного индекса
//        System.out.println(n);

//        String s;
//        double d = 3.9;
//        s = String.valueOf(d); // метом преобразования чего-либо в строку
//        System.out.println(s);

//        String str = "1";
//        System.out.println("1 > 5 : " + str.compareTo("5")); // метод сравнения: если false, то результат будет с минусом
//        System.out.println("1 == 1 : " + str.compareTo("1")); // если равны, то возвращает 0
//        str = "7";
//        System.out.println("7 > 5 : " + str.compareTo("5")); // если true, то результат будет с +

//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
//        System.out.println(sb + "\n");
//
//        StringBuilder sb1 = new StringBuilder(1000);
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.length());
//        System.out.println(sb1 + "\n");
//
//        StringBuilder sb2 = new StringBuilder("Java");
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.length());
//        System.out.println(sb2 + "\n");

//        StringBuilder sb = new StringBuilder();
//        sb.append('a'); // метод, который добавляет в конец строки значение из скобок (любой тип данных преобразуется в строку и добавляется в конец строки
//        sb.append(true);
//        sb.append(10);
        //        sb.insert(5, "!"); // добавление чего либо в позицию: индекс, символ/строка/число
//        sb.delete(5, 7); // удаление элементов [x, y)
//        sb.deleteCharAt(5); // удаление конкретного элемента по индексу
//        sb.replace(5, 10, "Java"); // указать интервал удаления символов и что ВМЕСТО НИХ нужно указать
//        sb.append("Hello")
//                .append(" ") // можно указывать использование метода с новой строки или в одну строку
//                .append("World");
//
//        System.out.println(sb);
////        sb.reverse(); // метод разворота строки
////        System.out.println(sb);
//
//        System.out.println(sb.indexOf("l"));


//        String st = sb.substring(6, 7);
//
//        System.out.println(st);

        StringBuilder sb1 = createStr(5, 3);
        System.out.println(sb1);
        modifyStr(sb1, "=", "равно");
        modifyStr(sb1, "+", "плюс");
        modifyStr(sb1, "-", "минус");
        modifyStr(sb1, "*", "умножить");
        System.out.println(sb1);

    }

    public static StringBuilder createStr(int a, int b) {
        StringBuilder res = new StringBuilder();
        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return res;
    }

    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr) {
        int pos;
        while ((pos = stBuild.indexOf(oldStr)) != -1) {
//            stBuild.deleteCharAt(pos);
//            stBuild.insert(pos, "равно");
            stBuild.replace(pos, pos + 1, newStr);
        }
        return stBuild;
    }
}

//    public static int getFactorial(int num) {
//        int mul = 1;
//        try {
//            if (num < 1) { // условие для исключения, не предусмотренного ЯП
//                throw new Exception("Число меньше 1 указывать нельзя.");
//            }
//            for (int i = 1; i <= num; i++) {
//                mul *= i;
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage()); // вывод для текста исключения из условия исключения
//            mul = num;
//        }
//        return mul;

