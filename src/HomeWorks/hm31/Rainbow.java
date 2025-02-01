package HomeWorks.hm31;

import java.util.LinkedList;

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

        System.out.println("Список: " + rb);

        System.out.println("Список итераторов в прямом направлении: ");
        
        System.out.println("Список итераторов в обратном направлении: ");
    }
}
