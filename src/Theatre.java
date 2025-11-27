import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        ArrayList<Actor> listOfActors = new ArrayList<>();

        //Создаем актеров
        Actor actor1 = new Actor("Дмитрий", "Дмитриев", Gender.MALE, 183);
        Actor actor2 = new Actor("Петр", "Петров", Gender.MALE, 175);
        Actor actor3 = new Actor("Анна", "Иванова", Gender.FEMALE, 162);

        //Создаем режиссеров
        Director director1 = new Director("Дмитрий", "Федюков", Gender.MALE, 10);
        Director director2 = new Director("Федор", "Дмитриев", Gender.MALE, 3);

        //Создаем автора музыки и хореографа
        Person musicAuthor = new Person("Иван", "Иванов", Gender.MALE);
        Person choreographer = new Person("Юлия", "Васильева", Gender.FEMALE);

        //Создаем три спектакля: обычный, оперный, балет
        Show show = new Show("Сказочная страна", 153, director1);
        Opera opera = new Opera("Одиссея", 210, director2, musicAuthor, "Какой то интересный " +
                "текст длинного либретто оперы Одиссея", 20);
        Ballet ballet = new Ballet("Щелкунчик", 157, director1, musicAuthor, "Либретто текст " +
                "либретто текст либретто текст либретто текст либретто текст либретто текст", choreographer);

        //Добавлен актеров в обычный спектакль
        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);
        System.out.println("");

        //Добавляем актеров в оперу
        opera.addActor(actor1);
        opera.addActor(actor2);
        System.out.println("");

        //Добавляем актеров на балет
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        System.out.println("");

        //Выводим на экран список актеров для каждого спектакля
        show.printListOfActors();
        System.out.println("");
        opera.printListOfActors();
        System.out.println("");
        ballet.printListOfActors();
        System.out.println("");

        //Заменяем актера с фамилией актера 2 в опере на актера 3. Выводим обновленный список актеров оперы
        opera.replaceActor(actor3, actor2.getSurname());
        opera.printListOfActors();
        System.out.println("");

        //Пробуем заменить в балете несуществующего актера
        ballet.replaceActor(actor1, "Козлов");

        //Выводим на экран либретто оперы и балета
        opera.printLibrettoText();
        System.out.println("");
        ballet.printLibrettoText();
    }
}
