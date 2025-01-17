package HomeWorks.hmOld;

public class HomeWork15 {
    public static void main(String[] args) {
        String s = "Hello, World";
        int[] resultLow = new int['z' - 'a' + 1];
        int[] resultUp = new int['Z' - 'A' + 1];
        int countLow = 0;
        int countUp = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                resultUp[ch - 'A']++;
                countUp++;
            }
            if (ch >= 'a' && ch <= 'z') {
                resultLow[ch - 'a']++;
                countLow++;
            }
        }

        System.out.println("Дана строка - " + s);
        System.out.println("Количество строчных букв - " + countLow + ", количество прописных букв - " + countUp);
    }
}
