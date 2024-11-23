package lesson5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SimpleTimeZone;

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

        String s = "я буду хорошим программистом";
        System.out.println(s);
        int[] result = new int['я' - 'а' + 1];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                result[ch - 'а']++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }

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

