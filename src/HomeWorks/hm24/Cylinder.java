package HomeWorks.hm24;

public class Cylinder extends Figure3d{
    private int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void calcVolume() {
        System.out.printf("Фигура: цилиндр  | Объём фигуры: %.2f%n", (Math.PI * getRadius() * getRadius() * height));
    }

}
