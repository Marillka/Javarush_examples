package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex3;

/*
Определяем интерфейс обработчика в абстрактном классе Handler (Обработчик). Там же определяем общие для всех конкретных обработчиков поле связи next (следующий) и метод для создания цепочки.
 */
public abstract class Handler {
    private Handler next;

    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }

    Handler link(Handler next) {
        this.next = next;
        return next;
    }
}
