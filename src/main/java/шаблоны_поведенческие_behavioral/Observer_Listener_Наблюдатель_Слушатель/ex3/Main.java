package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex3;


public class Main {
    public static void main(String[] args) {
        CatholicChurch observable = new CatholicChurch();

        observable.addPropertyChangeListener(new Parishioner("Мартин Лютер"));
        observable.addPropertyChangeListener(new Parishioner("Жан Кальвин"));

        observable.setNews("Сегодня хорошая погода");
        observable.setNews("Ожидается снегопадэ");
    }
}
