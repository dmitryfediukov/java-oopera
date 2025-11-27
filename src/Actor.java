import java.util.Objects;

public class Actor extends Person {
    private int height; //Рост актера

    //Конструктор
    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    //Переопределил метод toString, чтобы выводить актера в формате: Имя Фамилия (рост)
    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }

    /* Переопределил метод equals для метода добавления нового актера, чтобы можно было сравнивать нового актера с
    существующими */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor otherActor = (Actor) o;
        return Objects.equals(this.getName(), otherActor.getName()) &&
                Objects.equals(this.getSurname(), otherActor.getSurname()) &&
                (height == otherActor.height);
    }

    /* Переопределил метод hashCode для метода добавления нового актера, чтобы можно было сравнивать нового актера с
    существующими */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }
}
