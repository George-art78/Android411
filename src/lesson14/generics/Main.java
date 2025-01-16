package lesson14.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 5, 3, 4};
        Double[] doubleArray = {3.3, 2.2, 1.1, 4.4};
        Character[] charArray = {'G', 'e', 'n', 'e', 'r', 'i', 'c'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }

    public static <T> void printArray(T[] inputArray) { // generic обозначается как <T> (чаще всего указывается буква Т); обобщённый метод. Работает только с объектами (не примитивными типами данных)
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
