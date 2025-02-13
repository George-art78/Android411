package lesson16.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(334455, "Михаил Борисов");
        map1.put(778899, "Ренат Зуев");
        map1.put(443366, "Роман Свиридов");
        map1.put(225577, "Анна Полякова");
        map1.put(null, "Виктор Водник");
        map1.putIfAbsent(334455, "Ирина Мельник");//если ключ существует, то значение не перезаписывается
        System.out.println(map1);
        System.out.println(map1.get(225577));//метод вызова значения
        map1.remove(778899);//метод удаленияэ элемента по ключу
        System.out.println(map1);
        System.out.println(map1.containsValue("Роман Свиридов"));//метод для проверки элемента
        System.out.println(map1.containsKey(443366));//метод для проверки ключа
        System.out.println(map1.keySet());//метод для получения "массива" ключей
        System.out.println(map1.values());//метод для получения "массива" значений
    }
}
