package lesson14.exception;

public class Main {
    public static void main(String[] args) throws NegativeWithException {
        Square square = new Square(10);
        square.setWidth(-2);

        System.out.println("Ширина квадрата: " + square.getWidth());
        System.out.println("Площадь: " + square.calculateArea(square.getWidth()));
    }
}

class NegativeWithException extends Exception {
    public NegativeWithException(String message) {
        super(message);
    }
}

class Square {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea(int width) throws  NegativeWithException{
        if (width >= 0) {
            return width * width;
        } else {
            throw new NegativeWithException("Ширина квадрата: " + width + ". Значение не может быть отрицательным.");
        }
    }
}
