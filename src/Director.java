public class Director extends Person{
    public int numberOfShows;

    Director(String name, String surname, Gender gender, int numberOfShows){
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
}