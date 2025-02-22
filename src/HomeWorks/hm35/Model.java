package HomeWorks.hm35;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Film> films;

    public Model() {
        this.films = new LinkedHashMap<>();
    }

    public void addFilm(Map dictFilm) {
        Film film = new Film(dictFilm);
        films.put((String) dictFilm.get("название фильма"), film);
    }

    public Collection getAllFilms() {
        return films.values();
    }
}

class Film {
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
