package HomeWorks;

import java.util.Scanner;
import java.util.Arrays;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {-2, 3, 8, -11, -4, 6};
        System.out.println(Arrays.toString(arr));
        System.out.print("n = " + negative(arr));
    }

    static int negative(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return 0;
    }
}
