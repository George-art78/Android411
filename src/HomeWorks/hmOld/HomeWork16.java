package HomeWorks.hmOld;

import java.util.Scanner;

public class HomeWork16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите фразу для проверки на палиндром: ");
        String str = input.nextLine();
        boolean result = palindrom(str);

        if (result == true) {
            System.out.println("Фраза является палиндромом.");
        } else {
            System.out.println("Фраза не является палиндромом.");
        }
    }
    public static boolean palindrom(String s) {
        String line = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            line += s.charAt(i);
        }
        if (line.replace(" ", "").equalsIgnoreCase(s.replace(" ", ""))) {
            return true;
        }
        else return false;
    }
}
