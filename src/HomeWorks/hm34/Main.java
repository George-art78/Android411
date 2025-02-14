package HomeWorks.hm34;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        char k1 = 'X', k2 = 'Y', k3 = 'Z';
        int a = 1, b = 2, c = 3;
        map1.put(k1, a);
        map1.put(k2, b);
        map1.put(k3, c);
        System.out.println("Исходный Map: " + map1);

        HashMap<Integer, Character> map2 = new HashMap<>();
        map2.put(a, k1);
        map2.put(b, k2);
        map2.put(c, k3);
        System.out.println("Изменённый Map: " + map2);
    }
}
