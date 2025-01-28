package lesson15.test;

interface Converter<F, T>{
    T convert(F from);
}

public class Sample6 {
    public static void main(String[] args) {
//        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Converter<String, Integer> converter = Integer::valueOf;//сокращённая форма лямбда выражения
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
