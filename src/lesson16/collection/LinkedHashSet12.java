package lesson16.collection;

import java.util.LinkedHashSet;

public class LinkedHashSet12 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();//сохраняет элементы в той последовательности, в которой они внесены пользователем
        lhs.add(7);
        lhs.add(3);
        lhs.add(1);
        lhs.add(4);
        lhs.add(9);
        System.out.println(lhs);
        lhs.remove(4);
        System.out.println(lhs);
        System.out.println(lhs.contains(4));//метод для проверки наличия указанного элемента
        System.out.println(lhs.contains(3));
        System.out.println(lhs.removeIf(x -> x > 5));//метод удаления элементов при выполнении условия
        System.out.println(lhs);
    }
}
