package lesson15.func;

import java.util.function.Predicate;

public class Lambda1 {
    public static void main(String[] args) {
//        Predicate<Integer> isPositive = x -> x > 0;//Predicate - уже созданный интерфейс
//        System.out.println(isPositive.test(5));

        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };
        String word1 = "Мадам";
        boolean res = isPalindrome.test(word1);
        System.out.println(word1 + " это палиндром: " + res);

        String word2 = "радар";
        boolean res2 = isPalindrome.test(word2);
        System.out.println(word2 + " это палиндром: " + res2);
    }
}
