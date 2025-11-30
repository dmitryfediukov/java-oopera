public class MusicalShow extends Show {
    protected Person musicAuthor; //автор музыки
    protected String librettoText; //текст либретто

    //Конструктор
    public MusicalShow(String title, int duration, Director director, Person musicAuthor,
                       String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    //Метод вывода на экран текста либретто музыкального спектакля
    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
