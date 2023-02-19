package шаблоны_поведенческие_behavioral.ChainOfResponsobility_ЦепочкаОбязанностей.ex1;

public class PayPalPayment implements Payment{
    Payment payment;
    @Override
    public void setNext(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay() {
        System.out.println("PayPal Payment");
    }
}
