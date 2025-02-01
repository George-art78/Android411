package HomeWorks.hm31;

import java.util.LinkedList;
import java.util.ListIterator;

public class Rainbow {
    public static void main(String[] args) {
        LinkedList<String> rb = new LinkedList<>();
        rb.add("Красный");
        rb.add("Оранжевый");
        rb.add("Жёлтый");
        rb.add("Зелёный");
        rb.add("Голубой");
        rb.add("Синий");
        rb.add("Фиолетовый");
        ListIterator<String> listIterator = rb.listIterator();

        System.out.println("Список: " + rb + "\n");

        System.out.println("Список итераторов в прямом направлении: ");
        while (listIterator.hasNext()) {
            System.out.println("Индекс = " + listIterator.nextIndex() + ", элемент = " + listIterator.next());
        }

        System.out.println("\nСписок итераторов в обратном направлении: ");
        while (listIterator.hasPrevious()) {
            System.out.println("Индекс = " + listIterator.previousIndex() + ", элемент = " + listIterator.previous());
        }
    }
}
