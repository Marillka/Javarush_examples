package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex2;

public class Main {
    public static void main(String[] args) {
        var catholicChurch = new CatholicChurch();

         new Parishioner("Мартин Лютер", catholicChurch);
         new Parishioner("Жан Кальвин", catholicChurch);

         catholicChurch.setNewsChurch("Инквизиция была ошибкой... месса Mea Culpa 12 марта 2000 года");
    }
}
