package HomeWorks.hm24;

public abstract class Figure3d {
    private int radius;

    public Figure3d(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public abstract void calcVolume();
}
