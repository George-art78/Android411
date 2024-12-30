package lesson11;

public class Sample {
    public static void main(String[] args) {
//        Animal an = new Animal()
        Cat cat = new Cat("Tom");
        cat.makeSound();
        cat.sleep();

        Animal animals[] = new Animal[2];
        animals[0] = new Dog("Тузик");
        animals[1] = new Cat("Тео");

        for (Animal anim : animals) {
            anim.makeSound();
            anim.sleep();
        }
    }
}

abstract class Animal { // асбтрактный класс - класс содержащий абстрактный метод (метод без реализации)
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " спит!");
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound(); // абстрактный метод. После фигурных скобок идёт реализация метода
}

// Нельзя создать экземпляр абстрактного класса

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " гавкает!");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает!");
    }
}
