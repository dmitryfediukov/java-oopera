import java.util.ArrayList;

public class Show {
    private String title; //наименование спектакля
    private int duration; //длительность спектакля
    private Director director; //режиссер спектакля
    private ArrayList<Actor> listOfActors = new ArrayList<>(); //список актеров спектакля

    /*Конструктор. Изначально в конструкторе был список актеров, но затем его убрал, так как в задании было сказано
    добавлять актеров, используя метод добавления нового актера в спектакль*/
    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    //Метод вывода на экран списка актеров спектакля. Для метода переопределял метод toString в классе Actor
    public void printListOfActors() {
        System.out.println("Список актеров '" + getTitle() + "':");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    //Метод вывода режиссера. Для метода переопределял метод toString в классе Person
    public void printDirector() {
        System.out.println(director);
    }

    /*Метод добавления нового актера в спектакль.
    Для метода переопределял методы equals и hashcode в классе Actor.
    Если в спектакле уже есть актер с такими же именем, фамилией и ростом, то актера не добавим, выведем
    соответствующее сообщение.
    Если актера в спектакле такого нет, то добавим и выведем сообщение*/
    public void addActor (Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("В спектакле '" + getTitle() + "' уже есть актер: " + actor);
        } else {
            listOfActors.add(actor);
            System.out.println("В спектакль '" + getTitle() + "' добавлен актер: " + actor);
        }
    }

    //геттер наименования спектакля
    public String getTitle() {
        return title;
    }

    /* Метод замены актера в спектакле. В метод передается новый актер и фамилия актера, которого необходимо заменить.
    Если актер с переданной фамилией не будет найден, то замена не будет воспроизведена. Выведется соответствующее
    сообщение.
    Если актер с переданной фамилией будет найден, то произведем замену, сообщение никакое не выведем.*/
    public void replaceActor(Actor newActor, String surnameToReplace) {
        int counter = 0;
        ArrayList<Actor> sameSurnameActors = new ArrayList<>();

        //Перебираем всех актером в спектакле, записываем в список всех, чья фамилия равна указанной.
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surnameToReplace)) {
                sameSurnameActors.add(actor);
            }
        }

        /* Если в списке актеров с одинаковой фамилией 1 актер, то производим замену.
        Если в списке больше 1 актера, то выкидываем сообщение, что приложение пока не умеет производить замену при
        таком кейсе.
        Если актера не нашли, то замену тоже не производим. */
        if (sameSurnameActors.size() == 1) {
            listOfActors.remove(sameSurnameActors.getFirst());
            listOfActors.add(newActor);
            System.out.println("Замена актера произошла успешно.");
            return;
        } else if (sameSurnameActors.size() > 1) {
            System.out.println("В спектакле больше 1 актера с указанной фамилией. Приложение пока не умеет" +
                    " производить замену актера при таком кейсе.");
            return;
        }

        System.out.println("Актер с фамилией " + surnameToReplace + " не найден.");
    }
}
