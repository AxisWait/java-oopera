import java.util.StringJoiner;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        if (height != actor.height) return false;
        if (!name.equals(actor.name)) return false;
        if (!surname.equals(actor.surname)) return false;
        return gender == actor.gender;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d)", name,surname,height);
    }
}
