import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Евгений", "Тихонов", Gender.MALE, 180);
        Actor actor2 = new Actor("Игорь", "Кравцев", Gender.MALE, 193);
        Actor actor3 = new Actor("Анна", "Тихонова", Gender.FEMALE, 167);

        Director director1 = new Director("Антон", "Силуанов", Gender.MALE);
        Director director2 = new Director("Аркадий", "Укупник", Gender.MALE);

        Show standartShow = new Show("Обычный", 60, director1, new ArrayList<>());
        Opera opera = new Opera("Опера", 40, director2, new ArrayList<>(), new Person("Евгений", "Нерзулов", Gender.MALE), "Бла бла бла", 5);
        Ballet ballet = new Ballet("Балет", 90, director1, new ArrayList<>(), new Person("Екатерина", "Нерзулова", Gender.FEMALE), "На на на", new Person("Max","Pain", Gender.MALE));

        standartShow.addNewActor(actor1);
        standartShow.addNewActor(actor3);
        opera.addNewActor(actor2);
        opera.addNewActor(actor3);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);

        standartShow.printAllActors();
        opera.printAllActors();
        ballet.printAllActors();

        standartShow.replaceActor(actor2, "Тихонова");
        standartShow.printAllActors();

        opera.replaceActor(actor1, "Трошкин");
        opera.printlibrettoText();
        ballet.printlibrettoText();
    }
}
