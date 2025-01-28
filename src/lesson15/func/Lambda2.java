package lesson15.func;

import lesson15.test.Main;

import java.util.function.Function;

public class Lambda2 {
    public static void main(String[] args) {
        Function<Integer, String> covert = x -> String.valueOf(x) + " долларов";
        System.out.println(covert.apply(5));

        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(5.8));
    }
}
