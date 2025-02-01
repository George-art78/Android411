package lesson16.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Валерий");
        arrayList.add("Ирина");
        arrayList.add("Игорь");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>(20);
        arrayList2.add("Валерий");
        arrayList2.add("Ирина");
        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Валерий");
        arrayList3.add("Ирина");
        System.out.println(arrayList3);

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList);
        System.out.println(arrayList4);

        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("Валерий");
        arrayList5.add(7);
        arrayList5.add(true);
        System.out.println(arrayList5);

        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("???");
        arrayList6.addAll(arrayList);
        System.out.println(arrayList6);
//        arrayList6.removeAll(arrayList);
//        System.out.println(arrayList6);
//        arrayList6.retainAll(arrayList);//удаление всех элементов, которые не входят в указанный список
//        System.out.println(arrayList6);
        List<String> myList = arrayList6.subList(0, 3);
        System.out.println(myList);
        myList.add("Борис");
        System.out.println(arrayList6);

//        String[] array = arrayList6.toArray(new String[6]);
//        for (String s : array) {
//            System.out.print(s + " ");
//        }

        Collections.sort(arrayList6);//метод сортировки от меньшего к большему
        System.out.println(arrayList6);

//        Collections.shuffle(arrayList6);//метод перемешивания элементов
//        System.out.println(arrayList6);

//        Collections.reverse(arrayList6);
//        System.out.println(arrayList6);

        Collections.swap(arrayList6, 0, 2);//метод меняет местами элементы по указанным индексам
        System.out.println(arrayList6);

        // итератор

        Iterator<String> iterator = arrayList6.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList6);
    }
}
