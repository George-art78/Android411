package lesson4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = 5.25f;
//        System.out.println(Math.round(num));
//        System.out.println(Math.floor(num));
//        System.out.println(Math.ceil(num));
//        System.out.println(Math.sqrt(num));
//        System.out.println(Math.pow(4, 2));
//        System.out.println(Math.PI);
//        System.out.print("Введите радиус окружности: ");
//        int radius = input.nextInt();
//        System.out.printf("Длина окружности: %.2f", 2 * Math.PI * radius);
//        System.out.print("Катет 1: ");
//        int katet1 = input.nextInt();
//        System.out.print("Катет 2: ");
//        int katet2 = input.nextInt();
//        System.out.printf("Гипотенуза: +.2f", Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2)));

//        hello("Irina");
//        hello("Igor");

//        getSum(2, 5);
//        int a = 1, b = 7;
//        getSum(a, b);

//        symbolDraw(9, '+', '-');
//        symbolDraw(7, 'X', '0');

//        int a = 30;
//        int b = 45;
//        System.out.println("Перед вызовом метода:\na = " + a + "\nb = " + b);
//        swapFunc(a, b);
//        System.out.println("После вызова метода:\na = " + a + "\nb = " + b);

//        int a = 11;
//        int b = 6;
//        int c = min(a, b);
//        System.out.println("Минимальное значение: " + c);
//        System.out.print("a = ");
//        int a = input.nextInt();
//        System.out.print("b = ");
//        int b = input.nextInt();
//        int c = operation(a, b);
//        System.out.println("Результат: " + c);
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + " в кубе = " + cub(i));
//        }
//        int n = 5; // рисовалка треугольника из чисел
//        for (int i = 1; i <= n; i++) {
//            printLine(1, i);
//        }
//        for (int i = n-1; i > 0 ; i--) {
//            printLine(1, i);
//        }
//        sum(1, 2, 3); // метод с нефиксированным количеством параметров
//        sum(1, 2, 3, 4, 5);
//        sum();
//        sum_str("Сумма двух чисел: ", 20, 10);
//        sum_str("Сумма трёх чисел: ", 20, 10, 3);
//        sum_str("Сумма: ");
//        find_num(2, 7, 0, 3, 1, 5, -13);
//        find_num(2, 7, 0, 3, 1, 5, -13, 13);
//        find_num(26);
//        find_num(99, 99, 100, 34, -39);
//        find_num(99, 39, 99, 100, 34);
//        System.out.println(ch(1,2,3,4,5,6,7,8,9));
//        System.out.println(ch(3,6,1,9,5));

        int[] num1 = {3, 8, 9, 4, 1, 2, 5};
        int[] num2 = {1, 2, 5};
        System.out.println(max(num1));
        System.out.println(max(num2));

    }
    public static int max(int[] mas) {
        int mx = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mx < mas[i]) {
                mx = mas[i];
            }
        }
        return mx;
    }

    public static ArrayList ch(int ...args) {
        ArrayList<Integer> mas = new ArrayList<>();
        float sum = 0;
        int count = 0;
        float average;
        for (int i : args) {
            sum += i;
            count++;
        }
        average = sum / count;
        System.out.print("Среднее арифметическое: " + average + "\n");
        for (int i : args) {
            if (i < average) {
                mas.add(i);
            }
        }
        return mas;
    }

    public static void find_num(int ...num) {
        int max = 0;
        for (int j: num) {
            if (j % 13 == 0 && j > 0) {
                if (max < j) {
                    max = j;
                }
            }
        }
        System.out.println(max == 0 ? "Число не найдено" : max);
    }

    public static void sum_str(String message, int ...num) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.print(message);
        System.out.println(res);
    }

    public static void sum(int ... num) {
        int res = 0;
//        for (int n: num)
//          res += n; равнозначные записи циклов
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.println(res);
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int cub(int a) {
        return a * a * a;
    }

    public static int operation(int a, int b) {
        int num;
        if (a < b) {
            num = a + b;
        } else {
            num = a - b;
        }
        return num;
    }

    public static int min(int n1, int n2) {
        int minCh;
        if (n1 > n2) {
            minCh = n2;
        } else {
            minCh = n1;
        }
        return minCh;
    }

    public static void swapFunc(int a, int b) {
        System.out.println("До замены:\na = " + a + "\nb = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("После замены:\na = " + a + "\nb = " + b);
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void getSum(int a, int b) {
        System.out.println(a+b);
    }
    public static void symbolDraw(int count, char a, char b) {
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                System.out.print(a);
            }
            else {
                System.out.print(b);
            }
        }
        System.out.println();
    }

}
