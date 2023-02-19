package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex3;

// Конкретный обработчик, который может в случае незанятости обработать запрос.
public class Operator extends Handler {
    private String name;

    public Operator(String name) {
        this.name = name;
    }

    @Override
    public void handle(Request request) {
        if (isBusy()) {
            System.out.printf("Оператор %s занят \n", name);
        } else {
            System.out.printf("Оператор %s обрабатывает Request %s \n", name, request.getData());
        }
    }

    private boolean isBusy() {
        return Math.random() < probability;
    }

    // вероятность занятости оператора
    private final double probability = 0.9;
}
