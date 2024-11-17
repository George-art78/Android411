package HomeWorks;



public class HomeWork7 {
    public static void main(String[] args) {
        int height = 7;
        int width = height * 2 - 1;
        int middle = width / 2;
        for (int i = 0, l = middle, r = middle; i < height; i++, l--, r++) {
            for (int j = 0; j < width; j++) {
                if (j >= l && j <= r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
