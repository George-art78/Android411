package HomeWorks.hm29;

import java.sql.SQLOutput;
import java.util.Scanner;

interface LengthOfWords{
    void check(String st1, String st2);
}

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Первое слово: ");
        String w1 = input.nextLine();
        System.out.print("Второе слово: ");
        String w2 = input.nextLine();

        LengthOfWords words = new LengthOfWords() {
            @Override
            public void check(String st1, String st2) {
                if (w1.length() < w2.length())
                    System.out.println("Самое короткое слово: " + w1);
                if (w1.length() > w2.length())
                    System.out.println("Самое короткое слово: " + w2);
                if (w1.length() == w2.length())
                    throw new EqualsWordsException("Слова имеют одинаковую длину");
            }
        };
        try {
            words.check(w1, w2);
        } catch (EqualsWordsException e) {
            System.out.println(e.getMessage());
        }
    }
}
