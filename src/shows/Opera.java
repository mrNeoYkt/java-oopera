package shows;

import persons.Actor;
import persons.Director;
import persons.Person;

import java.util.List;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director, List<Actor> listOfActors,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
