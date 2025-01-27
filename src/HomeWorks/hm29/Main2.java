package HomeWorks.hm29;

import java.util.Scanner;

interface LengthOfWords2{
    void check2(String t1, String t2);
}

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Первое слово: ");
        String w1 = input.nextLine();
        System.out.print("Второе слово: ");
        String w2 = input.nextLine();

        LengthOfWords2 words2 = (text1, text2) -> {
            if (w1.length() < w2.length())
                System.out.println("Самое короткое слово: " + w1);
            if (w1.length() > w2.length())
                System.out.println("Самое короткое слово: " + w2);
            if (w1.length() == w2.length())
                throw new EqualsWordsException("Слова имеют одинаковую длину");
        };

        try {
            words2.check2(w1, w2);
        } catch (EqualsWordsException e) {
            System.out.println(e.getMessage());
        }
    }
}
