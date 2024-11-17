package lessons;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num, sum = 0, count = 0;
//        float average;
//        do {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if (num < 0) {
//                sum += num;
//                count++;
//            }
//
//        } while (num != 0);
//        average = (float) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f", average);

//        int number, copy, reverse_number = 0; // Разворот числа наоборот (не зависимо от количества цифр
//        System.out.print("Введите число: ");
//        number = input.nextInt();
//        copy = number;
//        do {
//            reverse_number *= 10;
//            reverse_number += copy % 10;
//            copy /= 10;
//        }while (copy > 0);
//        System.out.println("Число " + number + (number == reverse_number ? " ":" не ") + "палиндром");

//        int i = 0;
//        while (i < 10) {
//            if (i == 3) {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }
//        System.out.println("Цикл завершён");

//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }

//        int n;
//        while (true) {
//            System.out.print("Введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0) {
//                break;
//            }
//        }

//        int i = 1; // при вложенном цикле сначала выполняются ВСЕ итерации вложенного цикла, потом переходит во внешний
//        while (i < 5) {
//            System.out.println("Внешинй цикл: i = " + i);
//            int j = 1;
//            while (j < 4) {
//                System.out.println("\tВнутренний цикл: j = " + j);
//                j++;
//            }
//            i++;
//        }

//        int i = 1; //таблица умножения)
//        while (i < 10) {
//            int j = 1;
//            while (j < 10) {
//                System.out.print(i + " * " + j + " = " + (i * j) + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                if (i % 2 == 0) {
//                    System.out.print("+");
//                }
//                    else {
//                        System.out.print("-");
//                }
//                    j++;
//            }
//            System.out.println();
//            i++;
//        }

//        for (int i = 0; i < 5; i++){
//            System.out.println(i);
//        }

//        int count = 0;
//        for (int i = 0; i < 6; i++){
//            System.out.print("-> ");
//            if (input.hasNextInt()) {
//                count++;
//            }
//            input.nextLine();
//        }
//        System.out.println("Вы ввели чисел: " + count);

        int n;
        System.out.print("Количество символов: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
