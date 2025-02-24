package HomeWorks.hm35;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Film> films;
    private String filmData;

    public Model() {
        this.filmData = "filmData.txt";
        this.films = loadData();
    }

    public void addFilm(Map dictFilm) {
        Film film = new Film(dictFilm);
        films.put((String) dictFilm.get("название фильма"), film);
    }

    public Collection getAllFilms() {
        return films.values();
    }

    public Map getUserFilm(String userName) {
        Film film = films.get(userName);
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название фильма", film.getTitle());
        dictFilm.put("жанр", film.getGenre());
        dictFilm.put("режиссёр", film.getDirector());
        return dictFilm;
    }

    public Film removeUserNameFilm(String userFilm) {
        return films.remove(userFilm);
    }

    public void saveFilm() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filmData))) {
            oos.writeObject(films);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loadData() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filmData))) {
            return (LinkedHashMap) ois.readObject();
        } catch (Exception ex) {
            return new LinkedHashMap<>();
        }
    }
}

class Film implements Serializable {
    private String title;
    private String genre;
    private String director;
    private String yearOfRelease;
    private String duration;

    public Film(Map dictFilm) {
        this.title = (String) dictFilm.get("название фильма");
        this.genre = (String) dictFilm.get("жанр");
        this.director = (String) dictFilm.get("режиссёр");
        this.yearOfRelease = (String) dictFilm.get("год выпуска");
        this.duration = (String) dictFilm.get("длительность");
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "\"" + title + "\"" +
                " в жанре " + genre +
                ", режиссёр: " + director +
                ", год выпуска: " + yearOfRelease +
                ", длительность: " + duration + " минут";
    }
}

