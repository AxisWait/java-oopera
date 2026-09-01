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
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printShowDirector() {
        System.out.print("Режиссер спектакля: ");
        System.out.println(director);
    }

    public void printAllActors() {
        System.out.println("Актерский состав:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println("-".repeat(20));
    }

    public void addNewActor(Actor newActor) {
        for (Actor existing : listOfActors) {
            if (existing.equals(newActor)) {
                System.out.println("Актер " + newActor + " уже есть!");
                System.out.println("-".repeat(20));
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актер " + newActor + " добавлен");
        System.out.println("-".repeat(20));
    }

    public void replaceActor(Actor newActor, String lastName) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(lastName)) {
                listOfActors.set(i, newActor);
                System.out.println("Актер " + lastName + " заменен на " + newActor);
                System.out.println("-".repeat(20));
                return;
            }
        }
        System.out.println("Актер с фамилией \"" + lastName + "\" не найден!");
        System.out.println("-".repeat(20));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Show{");
        sb.append("title='").append(title).append('\'');
        sb.append(", duration=").append(duration);
        sb.append(", director=").append(director);
        sb.append(", listOfActors=").append(listOfActors);
        sb.append('}');
        return sb.toString();
    }
}
