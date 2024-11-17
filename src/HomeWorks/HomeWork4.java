package HomeWorks;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount, amountFirst;
        System.out.print("Введите число от 1 до 99: ");
        amount = input.nextInt();
        amountFirst = amount;
        if (amount >= 1 & amount <= 99) {
            amount = amount % 10;
            if (amount == 1) {
                System.out.println(amountFirst + " копейка");
            }
            if (amount >= 2 & amount <= 4) {
                System.out.println(amountFirst + " копейки");
            }
            if (amount >= 5 & amount <= 9 | amount == 0) {
                System.out.println(amountFirst + " копеек");
            }
        }
        else {
            System.out.println("Введено неверное число");
        }
    }
}
