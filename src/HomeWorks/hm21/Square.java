package HomeWorks.hm21;

public class Square {
    private static int count;

    public static int square(int a) {
       return (int) Math.pow(a, 2);
    }

    public static double triangleGerone (int a, int b, int c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double triangleBaseAndHeight(double b, double h) {
        return (b * h) / 2;
    }

    public static int rectangle (int a, int b) {
        return a * b;
    }
}
