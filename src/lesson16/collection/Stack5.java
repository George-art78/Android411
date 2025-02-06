package lesson16.collection;

import java.util.Stack;

public class Stack5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Катя");
        stack.push("Виктор");
        stack.push("Игорь");
        stack.push("Михаил");
        stack.push("Ирина");
        System.out.println(stack);

        stack.remove(2);
        System.out.println(stack);
        System.out.println(stack.pop()); //метод для удаления последнего (верхнего) элемента из стэка
        System.out.println(stack);
    }
}
