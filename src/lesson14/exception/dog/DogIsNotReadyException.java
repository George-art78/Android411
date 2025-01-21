package lesson14.exception.dog;

public class DogIsNotReadyException extends Exception{//при создании своего класса исключений в названии ОБЯЗАТЕЛЬНО нужно указать слово "Exception"

    public DogIsNotReadyException(String message) {
        super(message);
    }
}
