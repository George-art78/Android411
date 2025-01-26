package lesson15.test;

interface Printable{
//    void print(String s);
    void print();
}

public class Sample1 {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Hello, Java!");//если принимается 1 параметр, то круглые скобки не нужны; если метод не принимает параметров, то должны быть пустые круглые скобки

        printable.print();//метод в последнем случае вызывается без указания параметра
    }
}
