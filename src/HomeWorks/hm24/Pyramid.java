package HomeWorks.hm24;

public class Pyramid extends Figure3d{ // за основу взят конус как простейший вид пирамиды
    private int height;

    public Pyramid(int radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void calcVolume() {
        System.out.printf("Фигура: пирамида | Объём фигуры: %.2f", ((Math.PI * getRadius() * getRadius() * height)/ 3));
    }
}
