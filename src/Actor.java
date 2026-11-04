import java.util.Objects;

public class Actor extends Person{
    private int height;
    Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    @Override 
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
               Objects.equals(surname, otherActor.surname) &&
               Objects.equals(gender, otherActor.gender) &&
               (height == otherActor.height);
    }
    @Override 
    public int hashCode() {
        int hash = 17; 
        if (name != null) { 
            hash = name.hashCode(); 
        }
        if (surname != null) {
            hash = hash + surname.hashCode(); 
        }
        if (gender != null) {
            hash = hash + gender.hashCode();
        }
        hash = hash + height;
        return hash; 
    }
}
