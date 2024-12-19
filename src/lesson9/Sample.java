package lesson9;

public class Sample {
    public static void main(String[] args) {
        Outer out = new Outer("внешний");
        System.out.println(out.name);
        System.out.println(out.inner.innerName); // вывод вложенного свойства (последовательное указание через точку)
        System.out.println(Outer.Inner.age);
        Outer.Inner.info(); // вызов статического метода происходит через указания имён класса/классов
        out.inner.func(); // вызов динамического метода происходит ТОЛЬКО через экземпляр класса
    }
}

class Outer {
    String name;
    Inner inner;

    public Outer(String name) {
        this.name = name;
        inner = new Inner("внутренний"); // экземпляр класса (вложенный класс)
    }

    class Inner {
        static int age;
        String innerName;

        static {
            age = 18;
        }

        public Inner(String innerName) {
            this.innerName = innerName;
        }

        public static void info(){
            System.out.println("Статический метод");
        }

        public void func(){
            System.out.println("Метод во вложенном классе");
        }
    }
}
