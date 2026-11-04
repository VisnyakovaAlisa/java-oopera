import java.util.ArrayList;

public class MusicalShow extends Show{
    public Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, 
        Person musicAuthor, String librettoText) {
        super(title, duration,director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    public String getLibrettoText(){
        return  librettoText;
    }
    public void printLibretto() {
        System.out.println(librettoText);
    }
}
