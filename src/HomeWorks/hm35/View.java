package HomeWorks.hm35;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);

    public String waitUserChoice() {
        System.out.println("===== Редактирование данных каталога фильмов =====");
        System.out.println("Действия с фильмами: ");
        System.out.println("1 - добавление фильма" + "\n2 - каталог фильмов" + "\nq - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userChoice = input.nextLine();
        System.out.println("==================================================");
        return userChoice;
    }

    public Map addUserFilm() {
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название фильма", "");
        dictFilm.put("жанр", "");
        dictFilm.put("режиссёр", "");
        dictFilm.put("год выпуска", "");
        dictFilm.put("длительность", "");
        System.out.println("========== Добавление фильма ==========");
        for (Map.Entry<String, String> el : dictFilm.entrySet()) {
            System.out.print("Введите " + el.getKey() + " фильма: ");
            dictFilm.put(el.getKey(), input.nextLine());
        }
        System.out.println("=======================================");
        return dictFilm;
    }

    public void showAllFilms(Collection films) {
        System.out.println("================ Каталог фильмов =================");
        for (var element : films) {
            System.out.println(element);
        }
        System.out.println("==================================================");
    }
}
