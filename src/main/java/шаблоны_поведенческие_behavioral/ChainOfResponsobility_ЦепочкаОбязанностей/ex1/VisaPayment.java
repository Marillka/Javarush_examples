package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex1;

public class VisaPayment implements Payment{
    private Payment payment;

    @Override
    public void setNext(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay() {
        System.out.println("Visa Payment");
    }
}
