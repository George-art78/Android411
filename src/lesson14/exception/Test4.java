package lesson14.exception;

public class Test4 {
    public static void main(String[] args) {
        try {
            ex();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());//метод для вывода самого текста исключения (без пути его расположения)
            e.printStackTrace();//метод для вывода самого исключения с указанным текстом (красным цветом)
        }
    }

    public static void ex() throws RuntimeException {
        throw new RuntimeException("Hello, Exception!!!");
    }
}
