package HomeWorks;

import java.util.Scanner;
import java.util.Arrays;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {-2, 3, 8, -11, -4, 6};
        System.out.println(Arrays.toString(arr));
        System.out.print("n = " + negative(arr, 0));
    }

    static int negative(int[] array, int index) {
        if (index == array.length)
            return 0;
        return (array[index] < 0 ? 1 : 0) + negative(array, index + 1);
    }
}
