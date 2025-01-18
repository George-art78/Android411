package HomeWorks.hm27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество элементов числового массива: ");
        int countInt = input.nextInt();
        Integer[] arrInt = new Integer[countInt];

        for (int i = 0; i < countInt; i++) {
            System.out.print("-> ");
            arrInt[i] = input.nextInt();
        }

        System.out.print("Введите количество элементов массива строк: ");
        int countString = input.nextInt();
        String[] arrString = new String[countString];
        input.nextLine();

        for (int i = 0; i < countString; i++) {
            System.out.print("-> ");
            arrString[i] = input.nextLine();
        }

        PrintArray prArrInt = new PrintArray<>(arrInt);
        prArrInt.printArray(arrInt);

        System.out.println();

        PrintArray prArrString = new PrintArray<>(arrString);
        prArrString.printArray(arrString);
    }
}
