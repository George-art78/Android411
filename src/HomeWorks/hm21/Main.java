package HomeWorks.hm21;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата: " + Square.square(7));
        System.out.println("Площадь треугольника по формуле Герона: " + Square.triangleGerone(3, 4, 5));
        System.out.println("Площадь треугольника через основание и высоту: " + Square.triangleBaseAndHeight(6, 7));
        System.out.println("Площадь прямоугольника: " + Square.rectangle(2, 6));
        System.out.println("Количество подсчётов площади: " + Square.getCount());
    }
}
