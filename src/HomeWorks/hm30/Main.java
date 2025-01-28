package HomeWorks.hm30;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Predicate<String> line = str -> str.isEmpty();

        System.out.print("Строка 1: ");
        String s1 = input.nextLine();
        boolean res = line.test(s1);
        System.out.println("Строка 1 пустая: " + res);

        System.out.print("Строка 2: ");
        String s2 = input.nextLine();
        boolean res2 = line.test(s2);
        System.out.println("Строка 2 пустая: " + res2);
    }
}
