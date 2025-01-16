package lesson14.enums2;

import java.util.Random;

public enum Direction {
    TOP, RIGHT, LEFT, BOTTOM;

    private static final Random RAND = new Random();

    public static Direction randomDirection() {
        Direction[] directions = values();
        return directions[RAND.nextInt(directions.length)];
    }
}
