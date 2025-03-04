package lesson15.test;

@FunctionalInterface//функциональный интерфейс; в таком интерфейсе можно указать только 1 метод для реализации
interface Operation {
    int execute(int x, int y);
//    String concat(String a, String b);
}

public class LambdaApp {
    public static void main(String[] args) {
        Operation func = action(10);
        int a = func.execute(6,5);
        System.out.println(a);

        int b = action(2).execute(8,2);
        System.out.println(b);
    }

    public static Operation action(int number) {
        switch (number) {
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x - y;
            case 3:
                return (x, y) -> x * y;
            default:
                return (x, y) -> 0;
        }
    }
}
