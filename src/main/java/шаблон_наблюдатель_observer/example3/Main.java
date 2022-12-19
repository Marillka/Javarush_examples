package шаблон_наблюдатель_observer.example3;


public class Main {
    public static void main(String[] args) {
        CatholicChurch observable = new шаблон_наблюдатель_observer.example3.CatholicChurch();

        observable.addPropertyChangeListener(new Parishioner("Мартин Лютер"));
        observable.addPropertyChangeListener(new Parishioner("Жан Кальвин"));

        observable.setNews("Сегодня хорошая погода");
        observable.setNews("Ожидается снегопадэ");
    }
}
