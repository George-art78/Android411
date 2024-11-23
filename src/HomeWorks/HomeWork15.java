package HomeWorks;

public class HomeWork15 {
    public static void main(String[] args) {
        String s = "Hello, World";
        System.out.println(s);
        int[] resultLow = new int['z' - 'a' + 1];
        int[] resultUp = new int['Z' - 'A' + 1];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                resultUp[ch - 'A']++;
            }
            if (ch >= 'a' && ch <= 'z') {
                resultLow[ch - 'a']++;
            }
        }
        for (int i = 0; i < resultLow.length; i++) {
            System.out.println((char) (i + 'a') + " = " + resultLow[i]);
        }
        for (int i = 0; i < resultUp.length; i++) {
            System.out.println((char) (i + 'A') + " = " + resultUp[i]);
        }
    }
}
