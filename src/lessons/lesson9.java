package lessons;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class lesson9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String[] cities = {"Брянск", "Иркутск", "Владивосток", "Армавир"};
//        String[] cities2 = new String[cities.length + 1];
//
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i] = cities[i];
//        }
//        cities2[cities.length] = "Красноярск";
//
//        System.out.println(Arrays.toString(cities2));

//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Брянск");
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//        cities.add(1, "Красноярск");
//        System.out.println(cities);
//        System.out.println(cities.get(2)); // аналог в массивах как cities [2]
//        cities.set(2, "Курск");
//        System.out.println(cities.size());
//
//        cities.remove(1);
//
//        for (String city : cities) {
//            System.out.print(city + "\t");
//        }

//        System.out.println("\n" + cities.indexOf("Владивосток"));
//        if (cities.contains("Курск")) {
//            System.out.println("ArrayList содержит Курск");
//        }

//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка: ");
//        while ((n = input.nextInt()) > 0) {
//            mas.add(n);
//        }
//        System.out.println(mas);
//        System.out.print("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//        System.out.println(mas);

//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int)(Math.random() * 100));
//        }
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//        for (int i = 0; i < 10; i++) {
//            if (mas.get(i) > max) {
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
////        ind = mas.indexOf(max);
////        System.out.println(ind);
//        mas.remove(mas.indexOf(max));
//        mas.add(0, max);
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }

//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33));
//        ArrayList<Integer> c = new ArrayList<>();
//        System.out.println(b);

        int[][] num = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11}
        };
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
