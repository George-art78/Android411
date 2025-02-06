package lesson16.collection;

import java.util.*;

public class HashSet9 {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbers();
            checkDuplicates(numbers);
        } catch (Duplicate_Number_Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static List<Integer> readNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Кол-во чисел: ");
        int count = input.nextInt();

        System.out.println("Введите целые числа: ");
        for (int i = 0; i < count; i++) {
            System.out.print("-> ");
            int num = input.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static void checkDuplicates(List<Integer> numbers) throws Duplicate_Number_Exception{
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            if (uniqueNumbers .contains(num)) {
                throw new Duplicate_Number_Exception("Обнаружен повторяющийся номер: " + num);
            }
            uniqueNumbers.add(num);
        }
    }
}

class Duplicate_Number_Exception extends Exception {
    public Duplicate_Number_Exception(String message) {
        super(message);
    }
}
