package HomeWorks;

public class HomeWork15 {
    public static void main(String[] args) {
        String s = "Hello, World";
        System.out.println(s);
        int[] result = new int[('Z' - 'A') + 1];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'Z' && ch <= 'A') {
                result[ch - 'A']++;
            }
            if (ch >= 'a' && ch <= 'z') {
                result[ch - 'a']++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'a') + " = " + result[i]);
            System.out.println((char) (i + 'A') + " = " + result[i]);
        }
    }
}
