package lesson16.maps;

import java.util.HashMap;
import java.util.Objects;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(new Key("Виталий"), 20);
        map.put(new Key("Александр"), 30);
        map.put(new Key("Виталий"), 40);
        map.put(new Key("Александра"), 25);

        System.out.println();
        System.out.println("Значение для Виталий: " + map.get(new Key("Виталий")));
    }
}

class Key{
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        return key.equals(((Key) o).key);
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0);
        System.out.println("hashCode для ключа: " + key + " = " + hash);
        return hash;
    }
}
