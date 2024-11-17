package HomeWorks;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1 - прямоугольник, 2 - треугольник, 3 - круг: ");
        int figure = input.nextInt();
        if (figure == 1) {
            System.out.print("Длина: ");
            double l = input.nextDouble();
            System.out.print("Ширина: ");
            double w = input.nextDouble();
            System.out.println("Площадь: " + rectangle(l, w));
        }
        if (figure == 2) {
            System.out.print("Основание: ");
            double f = input.nextDouble();
            System.out.print("Высота: ");
            double h = input.nextDouble();
            System.out.printf("Площадь: %.2f", triangle(f, h));
        }
        if (figure == 3) {
            System.out.print("Радиус: ");
            double r = input.nextDouble();
            System.out.printf("Площадь: %.2f", circle(r));
        }
        if (figure != 1 && figure != 2 && figure != 3) {
            System.out.println("Введено некорректное значение.");
        }
    }
    public static double rectangle(double length, double width) {
        double square = length * width;
        return square;
    }

    public static double triangle(double founding, double height) {
        double square = (founding * height) / 2;
        return square;
    }

    public static double circle (double radius) {
        double square = Math.PI * Math.pow(radius, 2);
        return square;
    }
}
