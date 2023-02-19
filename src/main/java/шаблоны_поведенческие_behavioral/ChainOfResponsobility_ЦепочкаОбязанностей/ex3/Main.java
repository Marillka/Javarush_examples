package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex3;
/*
Оператор #1 занят
Оператор #2 занят
Оператор #3 занят
Все операторы заняты, пожалуйста подождите
Оператор #1 занят
Оператор #2 занят
Оператор #3 обрабатывает Request 0
Оператор #1 обрабатывает Request 1

 */
public class Main {
    public static void main(String[] args) {
        Handler handler = new BusyHandler();

        // собираем цепочку и закольцовываем обработку
        handler.link(new Operator("#1"))
                .link(new Operator("#2"))
                .link(new Operator("#3"))
                .link(handler);

        // Тест цепочки обработчиков. Клиент взаимодействует с интерфейсом, а не с конкретной реализацией.

        //генериреум поток из 10 запросов
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            handler.handle(new Request() {
                @Override
                public String getData() {
                    return Integer.toString(temp);
                }
            });
        }
    }
}
