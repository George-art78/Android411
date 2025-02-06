package lesson16.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet10 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();//список в отсортированном виде
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(7);
        System.out.println(treeSet);
        treeSet.remove(7);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(5));
        System.out.println(treeSet.contains(2));
    }
}
