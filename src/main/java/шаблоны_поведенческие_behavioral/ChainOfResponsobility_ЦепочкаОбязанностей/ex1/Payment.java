package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex1;

public interface Payment {
    void setNext(Payment payment);
    void pay();
}
