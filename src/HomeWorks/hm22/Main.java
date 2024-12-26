package HomeWorks.hm22;

public class Main {
    public static void main(String[] args) {
        Box3D box = new Box3D(5, 3, 2);
        System.out.println(box);
        System.out.println("Объём: " + (box.getDeep() * box.getHeight()* box.getWidth()));
    }
}
