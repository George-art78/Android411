package lesson3;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int a = 20, b = 10;
//        System.out.println(a == b ? "a==b" : a > b ? "a > b" : "b > a");

//        int a = 7, b = 5;
//        System.out.println(b == 0 ? "На 0 делить нельзя" : (float) (a / b));

//        int month;
//        int numDay = 0;
//        int year;
//        System.out.print("Введите месяц числом: ");
//        month = input.nextInt();
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDay = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDay = 30;
//                break;
//            case 2:
//                System.out.printf("Введите год: ");
//                year = input.nextInt();
//                if (year % 4 == 0) {
//                    numDay = 29;
//                } else {
//                    numDay = 28;
//                }
//                break;
//            default:
//                System.out.println("Такого месяца не существует");
//        }
//        if (month >= 1 && month <= 12) {
//            System.out.println("Количество дней: " + numDay);
//        }
//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        switch (month) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Зима");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень");
//                break;
//            default:
//                System.out.println("Такого месяца нет");
//                break;
//        }
//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        String s = switch (month) {
//            case 12, 1, 2 -> "Зима";
//            case 3, 4, 5 -> "Весна";
//            case 6, 7, 8 -> "Лето";
//            case 9, 10, 11 -> "Осень";
//            default -> s = "Такого месяца нет.";
//        };
//        System.out.print(s);

//        System.out.print("Введите балл по 12 бальной системе оценивания: ");
//        int num = input.nextInt();
//        System.out.print("Ваш балл по 5 бальной системе оценивания: ");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3 :
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0) {
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Такого значения нет");
//        }
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//        int n, sum = 0;
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()) {            // метод для проверки, введено число или строка
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//        }
//        System.out.println("Сумма введённых чисел: " + sum);

//        int start, finish, sum = 0;     // поиск суммы нечётных чисел
//        System.out.print("Введите начало диапазона: ");
//        start = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        finish = input.nextInt();
//        while (start <= finish) {
//            if (start % 2 != 0)
//                sum += start;
//            start++;
//        }
//        System.out.println("Сумма нечётных чисел: " + sum);

//        int i = 0;
//        do {
//            System.out.println("i = " + i);
//            i++;
//        } while (i <= 5);
    }
}
