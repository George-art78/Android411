package HomeWorks;


public class HomeWork17 {
    public static void main(String[] args) {
        StringBuilder orig = new StringBuilder(" Текст с повторящимися символами ");
        System.out.println("Исходная строка - \"" + orig + "\"");
        modifyStr(orig, " ", "");
        System.out.println("Изменённая строка - \"" + orig + "\"");
    }

    public static void modifyStr(StringBuilder str, String oldS, String newS) {
        int position;
        while ((position = str.indexOf(oldS)) != -1) {
            str.replace(position, position + 1, newS);
        }
    }
}
