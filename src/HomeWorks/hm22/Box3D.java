package HomeWorks.hm22;

public class Box3D extends Box{
    private double deep;

    public Box3D(double width, double height, double deep) {
        super(width, height);
        this.deep = deep;
    }

    public double getDeep() {
        return deep;
    }

    public void setDeep(double deep) {
        if (deep > 0)
            this.deep = deep;
    }

    @Override
    public String toString() {
        return "Объект Box3D {" + super.toString() +
                ", глубина = " + deep +
                '}';
    }
}
