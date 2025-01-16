package lesson14.enums;

import java.sql.SQLOutput;

enum Seasons{ // конструкция выбора из предустановленных значений (аналог массива)
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень");

    private String title;

    Seasons(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println(Seasons.WINTER);
//        System.out.println(Seasons.values()); // метод values возвращает массив значений из списка enum
        for (Seasons s : Seasons.values()) {
            System.out.println(s.name());
        }

        int ind = Seasons.SUMMER.ordinal(); // метод для вывода "индекса" значения
        System.out.println(ind);

//        Seasons arg = Seasons.SPRING;
//        switch (arg){
//            case WINTER:
//                System.out.println("Сейчас зима"); break;
//            case SUMMER:
//                System.out.println("Сейчас лето"); break;
//            case SPRING:
//                System.out.println("Сейчас весна"); break;
//            case AUTUMN:
//                System.out.println("Сейчас осень"); break;
//        }
    }
}
