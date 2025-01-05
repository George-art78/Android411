package lesson13;

interface GeomInterface{
    int MIN_COORD = 0; //константа в интерфейсе
    int MAX_COORD   = 1000;

    static void showInterval() { //в интерфейсе можно реализовать СТАТИЧЕСКИЙ метод (с обязательным указанием модификатора static
        System.out.println("[" + MIN_COORD + "; " + MAX_COORD + "]");
    }
}

//class InterfaceGroup{
//    interface Interface_1{
//        void method_1();
//    }
//
//    interface Interface_2{
//        void method_2();
//    }
//}

//class ReleaseInterface implements InterfaceGroup.Interface_1 {
//    @Override
//    public void method_1() {
//
//    }
//}

interface MathShape{
    double getSquare();

    default double getPerimeter(){// default - метод по умолчанию; вызывается только в классах, которые реализуют интерфейс
        return 0;
    }
}

abstract class Shape {
    private int width;
    private String color;

    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }

    abstract void draw();
}

class Line extends Shape implements GeomInterface{
    private int x1, x2, y1,y2;

    public Line(int width, String color, int x1, int x2, int y1, int y2) {
        super(width, color);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    private boolean isCheck(int value) {
        return value >= MIN_COORD && value <= MAX_COORD;
    }

    public void setCoord(int x1, int y1, int x2, int y2){
        if (isCheck(x1) && isCheck(y1) && isCheck(x2) && isCheck(y2)) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }

    @Override
    public String toString() {
        return "Координаты линии: " +
                "x1 = " + x1 +
                ", x2 = " + x2 +
                ", y1 = " + y1 +
                ", y2 = " + y2;
    }

    @Override
    void draw() {
        System.out.println("Рисование линии");
    }
}// можно указывать несколько интерфейсов через запятую

class Rectangle extends Shape implements MathShape{
    private int width;
    private int height;

    public Rectangle(int width, String color, int width1, int height) {
        super(width, color);
        this.width = width1;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование прямоугольника");
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    //    public double getSquare(){
//        return width * height;
//    }
}

class Triangle extends Shape implements MathShape{
    private int length;
    private int height;

    public Triangle(int width, String color, int length, int height) {
        super(width, color);
        this.length = length;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование треугольника");
    }

    @Override
    public double getSquare(){
        return 0.5 * length * height;
    }
}