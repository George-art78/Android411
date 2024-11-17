package lessons;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;
import java.util.Arrays;

public class lesson8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] array = new int[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.print("->");
//            array[i] = input.nextInt();
//        }
//        for (int i = array.length - 1; i > 0; i--) {
//            System.out.print(array[i] + " ");
//        }

//        int[] array = {1, 4, 6, 3, 8};
//        System.out.println(Arrays.toString(array)); //вывод элементов массива. Обазятелен импорт Arrays

//        int n, sum = 0;
//        System.out.print("n = ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println("Сумма отрицательных элементов массива: " + sum);

//        int[] array = new int[5];
//        int min;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("Минимальный элемент в массиве: " + min);

//        System.out.print("n = ");
//        int n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > array[i-1]) {
//                System.out.print(array[i] + " ");
//            }
//        }

//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length + 5];
//
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//
//        for (int i = 0; i < a2.length; i++) {
//            System.out.println(a2[i]);
//        }

        //(Math.random() * (max-min) + min по умолчанию Math.random() возвращает double из диапазона [min, max) рандомное число
//        int[] array = new int[10]; //заполнение массива случайными числами
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random() * 10);
//        }
//        System.out.println(Arrays.toString(array));

//        int count = 0, sum = 0;
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)((Math.random() * (50 - 10) + 10));
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//            if (array[i] % 2 != 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Количество чётных элементов: " + count);
//        System.out.println("Сумма нечётных элементов: " + sum);

        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
