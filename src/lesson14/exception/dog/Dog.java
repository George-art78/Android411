package lesson14.exception.dog;

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет!");
        isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет!");
        isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Собираемся на прогулку");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ура, идём гулять! " + name + " очень рад!");
        } else {
            throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку!");
        }
    }
}
