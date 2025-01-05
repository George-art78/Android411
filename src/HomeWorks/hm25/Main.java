package HomeWorks.hm25;

interface Size{
    double resize_Width(double width);
    double resize_Height(double height);
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 150);
        System.out.println(rectangle);

        System.out.printf("Width: %.0f, Height: %.0f", rectangle.resize_Width(250), rectangle.resize_Height(300));
    }
}

class Rectangle implements Size{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double resize_Width(double width) {
        return width;
    }

    @Override
    public double resize_Height(double height) {
        return height;
    }

    @Override
    public String toString() {
        return "Width: " + width + ", Height: " + height;
    }
}
