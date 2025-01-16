package lesson14.enums;

import javax.swing.plaf.PanelUI;
import java.util.PrimitiveIterator;
import java.util.regex.Pattern;

enum RegEx {
    UPPER("[A-Z]+"),
    LOWER("[a-z]+"),
    NUMERIC("[+-]?\\d+");

    private final Pattern pattern;

    RegEx(final String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public boolean test(final String input) {
        return pattern.matcher(input).matches();
    }
}

public class Base {
    public static void main(String[] args) {
        System.out.println(RegEx.UPPER.test("ABC"));
        System.out.println(RegEx.LOWER.test("abc"));
        System.out.println(RegEx.NUMERIC.test("-4851"));
    }
}
