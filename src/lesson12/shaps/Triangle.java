package lesson12.shaps;

public class Triangle extends Shape{
    private int side;

    public Triangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }

    @Override
    public void info() {
        System.out.println("=== Равносторонний треугольник ===\nСторона: " + side + "\nЦвет: " + getColor() + "\nПлощадь: " + getArea() + "\nПермиметр: " + getPerimeter());
        draw();
    }

    @Override
    public void draw() {
//        int copy = (int) side;
        for (int i = 0; i <= side; i++) {
            for (int j = i; j < side; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
//            copy--;
        }
    }
}
