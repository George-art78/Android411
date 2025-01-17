package HomeWorks.hmOld;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину: ");
        int n = input.nextInt();
        square(n);
    }
    public static void square(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number * 2; j++) {
                if (i >= 1 && i < (number - 1) && j >= 1 && j < (number * 2 - 1)) {
                    if (j % 2 != 0) {
                        System.out.print("\\");
                    }
                    else {
                        System.out.print("/");
                    }
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
