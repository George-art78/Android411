package HomeWorks;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите пятизначное число: ");
        int num0 = num.nextInt();
        int num1, num2, num3, num4, num5, res1, numFirst = num0;
        double res2;
        num1 = num0 % 10;
        num0 = num0 / 10;
        num2 = num0 % 10;
        num0 = num0 /10;
        num3 = num0 % 10;
        num0 = num0 / 10;
        num4 = num0 % 10;
        num0 = num0 / 10;
        num5 = num0 % 10;
        num0 = num0 / 10;
        res1 = num1 * num2 * num3 * num4 * num5;
        res2 = (num1 + num2 + num3 + num4 + num5) / 5.0;
        System.out.println("Произведение цифр числа " + numFirst + ": " + res1);
        System.out.printf("Среднее арифметическое числа %d: %.1f %n", numFirst, res2);
    }
}
