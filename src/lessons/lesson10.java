package lessons;
import java.util.Arrays;
import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int n = 5;
//        char[][] graph = new char[n][n];
////        for (int i = 0; i < graph.length; i++) {
////            System.out.println(Arrays.toString(graph[i]));
////        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                graph[i][j] = '*';
//            }
//        }
//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph[i].length; j++) {
//                System.out.print(graph[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 4, m = 3, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int)(Math.random() * 31) - 20;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//                if (mas[i][j] < 0) {
//                    count++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + count);

//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};
//        int[][] mas = {{1, 2},{3, 4, 5},{6, 7, 8, 9}};
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print("-> ");
//                mas[i][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int[][] mas = new int[5][];
////        mas[0] = new int[1];
////        mas[1] = new int[2];
////        mas[2] = new int[3];
////        mas[3] = new int[4];
////        mas[4] = new int[5];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = new int[5 - i];
//        }
//        int count = 10;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }
        int n = 5;
        int tp[][] = new int[n][];
        for (int i = 0; i < tp.length; i++) {
            tp[i] = new int[i+1];
            tp[i][0] = 1;
            tp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                tp[i][j] = tp[i-1][j-1] + tp[i-1][j];
            }
        }
        for (int i = 0; i < tp.length; i++) {
            for (int j = 0; j < tp.length - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < tp[i].length; j++) {
                System.out.print(tp[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
