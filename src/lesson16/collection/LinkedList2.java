package lesson16.collection;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        Student st1 = new Student("Viktor", 2);
        Student st2 = new Student("Anna", 3);
        Student st3 = new Student("Irina", 1);
        Student st4 = new Student("Igor", 3);
        Student st5 = new Student("Roman", 2);
        LinkedList<Student> stLL = new LinkedList<>();
        stLL.add(st1);
        stLL.add(st2);
        stLL.add(st3);
        stLL.add(st4);
        stLL.add(st5);
        System.out.println("LinkedList = " + stLL);
        Student st6 = new Student("Maria", 2);
        Student st7 = new Student("Sergey", 1);
        stLL.add(st6);
        stLL.add(1, st7);
        System.out.println("LinkedList = " + stLL);
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}