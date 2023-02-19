package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex3;

public class BusyHandler extends Handler {
    private Request request;

    @Override
    public void handle(Request request) {
        if (this.request == request) {
            System.out.println("Все операторы заняты, пожалуйста подождите");
        } else {
            this.request = request;
        }
        super.handle(request);
    }
}
