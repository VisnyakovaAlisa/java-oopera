import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        //Три актёра
        Actor actor1 = new Actor("Сергей", "Безруков", Gender.MALE, 180);
        Actor actor2 = new Actor("Константин", "Хабенский", Gender.MALE, 180);
        Actor actor3 = new Actor("Елизавета", "Боярская", Gender.FEMALE, 165);

        //Два режиссёра
        Director director1 = new Director("Константин", "Станиславский", Gender.MALE, 10);
        Director director2 = new Director("Евгений", "Вахтангов", Gender.MALE, 5);

        //Автор музыки и хореограф
        Person musicAuthor = new Person("Михаил", "Глинка", Gender.MALE);
        Person choreographer = new Person("Борис", "Эйфман", Gender.MALE);

        //Три спектакля: обычный, опера, балет
        ArrayList<Actor> actorsShow = new ArrayList<>();
        Show show = new Show("Обычный спектакль", 120, director1, actorsShow);

        ArrayList<Actor> actorsOpera = new ArrayList<>();
        Opera opera = new Opera("Травиата", 150, director2, actorsOpera,
                musicAuthor, "Текст либретто оперы Травиата", 40);

        ArrayList<Actor> actorsBallet = new ArrayList<>();
        Ballet ballet = new Ballet("Лебединое озеро", 130, director1, actorsBallet,
                musicAuthor, "Текст либретто балета Лебединое озеро", choreographer);

        //Распределяем актёров по спектаклям
        show.addActorToList(actor1);
        show.addActorToList(actor2);

        opera.addActorToList(actor2);
        opera.addActorToList(actor3);

        ballet.addActorToList(actor1);
        ballet.addActorToList(actor3);

        //Выводим списки актёров для каждого спектакля
        System.out.println("Обычный спектакль");
        show.printListOfActors();

        System.out.println("Опера");
        opera.printListOfActors();

        System.out.println("Балет");
        ballet.printListOfActors();

        //Заменяем актёра в одном спектакле на актёра из другого.
        opera.replaceActor("Хабенский", actor1);
        System.out.println("Опера после замены");
        opera.printListOfActors();

        //Пробуем заменить несуществующего актёра в другом спектакле
        System.out.println("Балет: попытка замены несуществующего актёра");
        ballet.replaceActor("Страдивари", actor2);

        //Выводим либретто для оперы и балета
        System.out.println("Либретто оперы");
        opera.printLibretto();

        System.out.println("Либретто балета");
        ballet.printLibretto();
    }
}