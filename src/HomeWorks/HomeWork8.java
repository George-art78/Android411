package HomeWorks;

import java.util.Scanner;
import java.util.Arrays;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        int first_element = input.nextInt();
        System.out.print("Введите конец диапазона: ");
        int last_element = input.nextInt();
        int[] array = new int[last_element - first_element + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = first_element;
            first_element++;
        }
        System.out.println(Arrays.toString(array));
    }
}
