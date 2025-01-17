package lesson14.generics;

import lesson9.numbers.Numbers;

public class Sample3 {
    public static void main(String[] args) {
        Point2<Integer> pt = new Point2<>(1, 2);
        Point2<Double> pt2 = new Point2<>(1.0, 2.0);

        System.out.println(pt.equalsPoint(pt2));

//        System.out.println(pt.getMax());
//        System.out.println(pt2.getMax());
    }
}

class Point2<T extends Number> { //Number - промежуточный класс для ВСЕХ ЧИСЛОВЫХ значений
    public T x, y;

    public Point2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    boolean equalsPoint(Point2<?> pt) {// T - может сравнивать только 1 тип данных; ? - работает с разными типами данных
        return x.doubleValue() == pt.x.doubleValue() && y.doubleValue() == pt.y.doubleValue();
    }

    double getMax() {
        double xd = x.doubleValue();
        double yd = y.doubleValue();

        return (xd < yd) ? yd : xd;
    }
}
