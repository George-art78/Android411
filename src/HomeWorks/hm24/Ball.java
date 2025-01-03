package HomeWorks.hm24;

public class Ball extends Figure3d{
    public Ball(int radius) {
        super(radius);
    }

    @Override
    public void calcVolume() {
        System.out.printf("Фигура: шар      | Объём фигуры: %.2f%n", (4 * Math.PI * getRadius() * getRadius()) / 3);
    }
}
