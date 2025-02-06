package lesson16.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSet5 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Валентин");
        set.add("Николай");
        set.add("Григорий");
        set.add("Александр");
        set.add("Александр");

        System.out.println(set);
        set.add("Анастасия");
        System.out.println(set);

        for (String s: set) {
            System.out.println(s);
        }
    }
}
