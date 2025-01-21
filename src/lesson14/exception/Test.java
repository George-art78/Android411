package lesson14.exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String first = input.nextLine();

        System.out.print("Введите второе число: ");
        String second = input.nextLine();

        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt(first);
            b = Integer.parseInt(second);
        } catch (NumberFormatException e){
            System.out.println("Одно или оба значения некорректны!");
        }

        System.out.println("Результат: " + (a + b));
    }
}
