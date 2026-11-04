import  java.util.ArrayList;
public class Show {
    public String title;
    public int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;

    Show(String title, int duration, Director director, ArrayList<Actor> listOfActors){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
    public void printListOfActors(){
        System.out.println("Список актеров:");
        for (Actor actor : listOfActors){
            System.out.println(actor.toString());
        }
    }
    public void addActorToList(Actor actorForAdd){
        boolean flag = true;
        for (Actor actor : listOfActors){
            if (actor.equals(actorForAdd)){
                flag = false;
            }
        }
        if (flag){
            listOfActors.add(actorForAdd);
        }
        else{
            System.out.println("Актёр " + actorForAdd + " уже есть в спектакле.");
        }
    }
    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден.");
    }
}
