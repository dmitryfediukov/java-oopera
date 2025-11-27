public class MusicalShow extends Show {
    private Person musicAuthor; //автор музыки
    private String librettoText; //текст либретто

    //Конструктор
    public MusicalShow(String title, int duration, Director director, Person musicAuthor,
                       String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    //Метод вывода на экран текста либретто музыкального спектакля
    public void printLibrettoText() {
        System.out.println("Либретто спектакля '" + getTitle() + "': " + librettoText);
    }
}
