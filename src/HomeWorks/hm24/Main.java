package HomeWorks.hm24;

public class Main {
    public static void main(String[] args) {
        Figure3d[] figures = new Figure3d[3];
        figures[0] = new Ball(5);
        figures[1] = new Cylinder(9, 15);
        figures[2] = new Pyramid(17, 125);

        for (int i = 0; i < figures.length; i++) {
            figures[i].calcVolume();
        }
    }
}
