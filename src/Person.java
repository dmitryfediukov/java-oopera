public class Person {
    protected String name; //имя
    protected String surname; //фамилия
    protected Gender gender; //пол (используем enum Gender)

    //Конструктор
    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    //Переопределил класс toString, для корректного вывода режиссера и актеров
    @Override
    public String toString() {
        return name + " " + surname;
    }

    //геттер имени
    public String getName() {
        return name;
    }

    //геттер фамилии
    public String getSurname() {
        return surname;
    }
}
