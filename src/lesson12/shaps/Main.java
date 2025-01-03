package lesson12.shaps;

public class Main {
    public static void main(String[] args) {
//        Square square = new Square(3, "red");
//        square.info();
//
//        Rectangle rectangle = new Rectangle(7, 3, "green");
//        rectangle.info();
//
//        Triangle triangle = new Triangle(5, "yellow");
//        triangle.info();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3, "red");
        shapes[1] = new Rectangle(7, 3, "green");
        shapes[2] = new Triangle(5, "yellow");

        for (Shape shape: shapes) {
            shape.info();
        }
    }
}
