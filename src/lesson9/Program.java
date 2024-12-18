package lesson9;

public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println(Point.getCount());
    }
}


class Point {
    private static int count; // статическая переменная, не привязана к конкретному экземпляру класса
    int x;
    int y;

   static  {
        count = 10;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

