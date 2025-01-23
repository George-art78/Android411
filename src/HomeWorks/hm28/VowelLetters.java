package HomeWorks.hm28;

import java.util.Scanner;
import java.util.Arrays;

public class VowelLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Исходная строка: ");
        String s = input.nextLine();

        try {
            voLetters(s);
        } catch (HaveNotVowelLettersException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void voLetters(String s) throws HaveNotVowelLettersException {
        char[] vowelLetters = {'e','y','u','i','o','a','у','е','а','о','э','я','и','ю'};
        boolean checkLetters = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vowelLetters.length; j++) {
                char sChar = s.charAt(i);
                if (sChar == vowelLetters[j]) {
                    System.out.println("Строка содержит гласные буквы.");
                    checkLetters = true;
                    break;
                }
            }
            if (checkLetters == true) {
                break;
            } else if (!checkLetters && i == s.length() - 1) {
                throw new HaveNotVowelLettersException("Ошибка: строка не содержит гласных букв.");
            }
        }
    }
}
