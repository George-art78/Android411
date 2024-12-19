package lesson9;

public class Sample2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Шарик");
        d1.run();
    }
}

class Dog {
    private String name;
    private Foot foot;

    public Dog(String name) {
        this.name = name;
        foot = new Foot(); // создание экземпляра ВЛОЖЕННОГО КЛАССА
    }

    void run() { // вызов метода вложенного класса
        foot.run(); // передаётся свойство внешнего класса в метов вложенного класса
    }

    class Foot { // вложенный класс
        void run() { // метод вложенного класса
            System.out.println("Собака " + name + " бежит...");
        }
    }
}
