package HomeWorks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork18and19 {
    public static void main(String[] args) {
        String s = "Java_master!@#";

        String pattern = "^[\\w-]{3,16}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
