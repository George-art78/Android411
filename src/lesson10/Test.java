package lesson10;

public class Test {
    public static void main(String[] args) {
        Line l1 = new Line(); // при создании экземпляра дочернего класса сначала отрабатывает конструктор родительского класса, потом - дочернего
        l1.color = "red";
        l1.width = 5;
        l1.x1 = l1.y1 = 0;
        l1.x2 = l1.y2 = 10;
//        l1.showProp();
        l1.show();
        l1.showId();
    }
}

class Properties {
    int width;
    String color;
    int id = 1;

    public Properties() {
        System.out.println("Конструктор Properties");
    }

    public Properties(int width, String color) {
        this.width = width;
        this.color = color;
        System.out.println("Конструктор Properties (width, color)");
    }

    void show(){
        System.out.println("Ширина - " + width + "рх, цвет - " + color);
    }
}

class Line extends Properties {
    double x1, y1;
    double x2, y2;
    int id = 2;

    public Line() {
        super(0, ""); // super делает обращение к родительскому классу (необходимо указать нужные параметры)
        System.out.println("Конструктор Line");
    }

    @Override // аннотация (работает переопределение и без него)
    void show() {
        super.show(); // переопределение метода (запрашивается метод из родительского класса)
        System.out.println("Координаты линии - х1: " + x1 + ", x2: " + x2 + ", y1: " + y1 + ", y2: " + y2);
    }

    void showId() {
        System.out.println("id = " + id + ", super.id = " + super.id);
    }
}

class Triangle extends Properties {
    double x1, y1;
    double x2, y2;
    double x3, y3;
}
