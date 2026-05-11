import java.util.ArrayList;
import java.util.List;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public String getTitle() {
        return title;
    }

    public void printDirectorInfo() {
        System.out.println("Режиссер спектакля: \"" + title + "\": " + director);
    }

    public void printActors() {
        System.out.println("Актеры спектакля: \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст.");
            return;
        }

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor + " уже добавлен в спектакль \"" + title + "\".");
            return;
        }

        listOfActors.add(actor);
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.equals(oldActor)) {
                listOfActors.set(i, newActor);
                return;
            }
        }

        System.out.println("Актер " + oldActor + " не найден в спектакле \"" + title + "\".");
    }
}
