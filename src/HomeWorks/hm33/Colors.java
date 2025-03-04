package HomeWorks.hm33;

import java.util.HashMap;
import java.util.Map;

public class Colors {
    public static void main(String[] args) {
        Map<String, Color> colorsList = new HashMap<>();
        String[] colors = {"red", "orange", "aqua", "pink", "gray", "blue", "white", "black", "yellow", "brown"};

        for (int i = 0; i < colors.length; i++) {
            Color c = new Color(colors[i]);
            colorsList.put(colors[i], c);
        }

        printColors(colorsList);
    }

    public static void printColors(Map<String, Color> map) {
        for (Map.Entry<String, Color> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
