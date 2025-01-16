package HomeWorks.hm26;

enum Transports {
    CAR(65),
    TRUCK(55),
    AIRPLANE(600),
    TRAIN(70),
    BOAT(22);

    private int speed;

    Transports(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

public class TransportSpeed {
    public static void main(String[] args) {

        System.out.println("Скорость самолёта составляет 600 миль в час.\n");

        System.out.println("Скорости транспортных средств: ");

        for (Transports transports : Transports.values()) {
            System.out.println(transports.name() + " типичная скорость составляет " + transports.getSpeed() + " миль в час.");
        }
        System.out.println();
    }
}
