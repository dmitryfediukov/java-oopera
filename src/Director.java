public class Director extends Person {
    private int numberOfShows; //количество поставленных спектаклей

    //Конструктор
    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
}
