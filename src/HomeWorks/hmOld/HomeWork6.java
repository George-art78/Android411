package HomeWorks.hmOld;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, position;
        char symbol;
        System.out.print("Количество символов: ");
        count = input.nextInt();
        System.out.print("Тип символа: ");
        symbol = input.next().charAt(0);
        System.out.printf("0 - горизонтальная\n1 - вертикальная\nОриентация линии: ");
        position = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (position == 0) {
                System.out.print(symbol);
            }
            if (position == 1) {
                System.out.println(symbol);
            }
            if (position != 0 && position != 1) {
                System.out.println("Введена неверная ориентация линии");
            }
        }
    }
}
