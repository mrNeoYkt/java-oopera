package shows;

import persons.Actor;
import persons.Director;

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

    public void replaceActor(Actor actor, String surname) {
        int actorIndex = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surname)) {
                if (actorIndex != -1) {
                    System.out.println("В спектакле \"" + title + "\" найдено несколько актеров с фамилией "
                            + surname + ". Потребуется уточнение, какого именно актера необходимо заменить.");
                    return;
                }
                actorIndex = i;
            }
        }

        if (actorIndex == -1) {
            System.out.println("Актер с фамилией " + surname + " не найден в спектакле \"" + title + "\".");
            return;
        }

        listOfActors.set(actorIndex, actor);
        System.out.println("Актер с фамилией " + surname + " был успешно заменен.");
    }
}
