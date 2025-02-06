package HomeWorks.hm32;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_NumMin {
    public static void main(String[] args) {
        TreeSet<Integer> minTreeSet = new TreeSet<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("-> ");
            int a = input.nextInt();
            minTreeSet.add(a);
        }

        System.out.println("Наименьший элемент в TreeSet: " + minTreeSet.getFirst());
    }
}
