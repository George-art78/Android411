package HomeWorks.hmOld;


public class HomeWork17 {
    public static void main(String[] args) {
        String orig = " Текст с повторяющимися символами ";
        StringBuilder builder = new StringBuilder();
        System.out.println("Исходная строка - \"" + orig + "\"");
        for (int i = 0; i < orig.length(); i++) {
            if (builder.indexOf(String.valueOf(orig.charAt(i))) == -1) {
                builder.append(orig.charAt(i));
            }
        }
        int position;
        if ((position = builder.indexOf(" ")) != -1) {
            System.out.println("Изменённая строка - \"" + modifyStr(builder, " ", "") + "\"");
        }
    }

    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr) {
        int pos;
        while ((pos = stBuild.indexOf(oldStr)) != -1) {
            stBuild.replace(pos, pos + 1, newStr);
        }
        return stBuild;
    }

}
