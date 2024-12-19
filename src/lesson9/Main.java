package lesson9;

public class Main {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        obj.calculate(1,2);
        obj.calculate(1,2, 3);

        obj.calculate(2.5, 3.4);
        obj.calculate(2.5, 2);
        obj.calculate(2, 2.5);
    }
}

class Calculation {
    public void calculate(int a, int b) {
        System.out.println("Сумма двух целых чисел: " + (a + b));
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Сумма трёх целых чисел: " + (a + b + c));
    }

    public void calculate(double a, double b) {
        System.out.println("Сумма двух вещественных чисел: " + (a + b));
    }

    public void calculate(double a, int b) {
        System.out.println("В результате вещественных чисел: " + (a + b));
    }

    public void calculate(int a, double b) {
        System.out.println("Сумма двух вещественных чисел: " + (int)(a + b));
    }
}

// Способы перегрузки методов:
//1. По количеству параметров (строка 16)
//2. Перегрузка по типу параметров (строка 22)
//3. Перегрузка по параметру параметров (строка 27)
