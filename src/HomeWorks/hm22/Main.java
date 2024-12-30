package HomeWorks.hm22;

public class Main {
    public static void main(String[] args) {
        Box3D box = new Box3D(5, 3, 2);
        System.out.println(box);
        System.out.println("Объём: " + (box.getDeep() * box.getHeight()* box.getWidth()));
        System.out.println();

        box.setWidth(10);
        box.setHeight(5);
        box.setDeep(7);
        System.out.println("Новые значения");
        System.out.println("Ширина: " + box.getWidth());
        System.out.println("Высота: " + box.getHeight());
        System.out.println("Глубина: " + box.getDeep());

        System.out.println(box);
        System.out.println("Объём: " + (box.getDeep() * box.getWidth() * box.getHeight()));
    }

}
