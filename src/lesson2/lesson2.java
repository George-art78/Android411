package lesson2;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        System.out.println("Введите число: ");
////        int num = input.nextInt();
////        System.out.println(num);
////        System.out.print("Имя: ");
////        String name = input.nextLine();
////        System.out.print("Возраст: ");
////        int age = input.nextInt();
////        System.out.print("Рост: ");
////        float height = input.nextFloat();
////        System.out.printf("Имя: %s. Возраст: %d. Рост: %.2f %n", name, age, height);
////        input.close();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите четыре числа: ");
        System.out.print("1: ");
        int a = input.nextInt();
        System.out.print("2: ");
        int b = input.nextInt();
        System.out.print("3: ");
        int c = input.nextInt();
        System.out.print("4: ");
        int d = input.nextInt();
        float sum1 = a + b;
        float sum2 = c + d;
        float result = sum1 / sum2;
        System.out.printf("Результат: %.2f %n", result);
        input.close();
    }
}
