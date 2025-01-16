package lesson14.generics;

public class Sample1 {
    public static void main(String[] args) {
        Point<Integer, String> pt = new Point<Integer, String>(1, 2, "point_1");
//        pt.x = 10;
//        pt.y = 20;
        System.out.println(pt.getX() + " " + pt.getY());

        Point<Double, Integer> pt1 = new Point<>(10.5, 20.6, 1);
//        pt1.x = 15.7;
//        pt1.y = 10.5;
        System.out.println(pt1.getX() + " " + pt1.getY());

//        Point pt2 = new Point();
//        pt2.x = "abc";
//        pt2.y = "def";
//        System.out.println(pt2.x + " " + pt2.y);
    }
}

class Point<T, V> { // дженерик указывается после имени класса
    private V id;
    private T x, y;

    public Point(T x, T y, V id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public V getId() {
        return id;
    }
}
