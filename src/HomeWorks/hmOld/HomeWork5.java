package HomeWorks.hmOld;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour;
        System.out.print("Введите количество часов: ");
        hour = input.nextInt();
        switch (hour) {
            case 0, 1, 2, 3, 4, 5 -> System.out.println("Доброй ночи");
            case 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Доброе утро");
            case 13, 14, 15, 16 -> System.out.println("Добрый день");
            case 17, 18, 19, 20, 21, 22, 23 -> System.out.println("Добрый вечер");
            default -> System.out.println("Неверное количество часов");
        }
    }
}
