package HomeWorks;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, a, b, c, s, radius;
        System.out.print("Выбор фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n: ");
        int number = input.nextInt();
        if (number == 1) {
            System.out.print("Введите сторону a: ");
            a = input.nextDouble(); // используется данный тип, т.к. стороны могут иметь дробные значения длины
            System.out.print("Введите сторону b: ");
            b = input.nextDouble();
            System.out.print("Введите сторону c: ");
            c = input.nextDouble();
            p = (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Площать треугольника: %.2f", s);
        }
        if (number == 2) {
            System.out.print("Введите сторону a: ");
            a = input.nextDouble();
            System.out.print("Введите сторону b: ");
            b = input.nextDouble();
            s = a * b;
            System.out.printf("Площать прямоугольника: %.2f", s);
        }
        if (number == 3) {
            System.out.print("Введите радиус: ");
            radius = input.nextDouble();
            s = Math.PI * Math.pow(radius, 2);
            System.out.printf("Площадь круга: %.2f", s);
        }
        if (number != 1 & number != 2 & number != 3) {
            System.out.println("Введено некорректное значение.");
        }
    }
}
