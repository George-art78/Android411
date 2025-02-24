package HomeWorks.hm35;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model filmModel;
    private View userInterface;

    public Controller() {
        this.filmModel = new Model();
        this.userInterface = new View();
    }

    public void runProgram() {
        String choice = "";
        while (!choice.equals("q")) {
            choice = userInterface.waitUserChoice();
            checkUserChoice(choice);
        }
    }

    public void checkUserChoice(String choice) {
        if (choice.equals("1")) {
            Map film = userInterface.addUserFilm();
            filmModel.addFilm(film);
        } else if (choice.equals("2")) {
            Collection films = filmModel.getAllFilms();
            userInterface.showAllFilms(films);
        } else if (choice.equals("3")) {
            String filmTitle = userInterface.getUserFilmTitle();
            try {
                Map film = filmModel.getUserFilm(filmTitle);
                userInterface.showFilm(film);
            } catch (NullPointerException npe) {
                userInterface.showIncorrectFilmNameError(filmTitle);
            }
        } else if (choice.equals("4")) {
            String filmTitle = userInterface.getUserFilmTitle();
            Film film = filmModel.removeUserNameFilm(filmTitle);
            userInterface.removeUserNameFilm(film);
        } else if (choice.equals("q")) {
            filmModel.saveFilm();
        } else {
            userInterface.showIncorrectChoiceError(choice);
        }
    }
}
