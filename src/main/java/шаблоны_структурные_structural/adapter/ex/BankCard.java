package шаблоны_структурные_structural.adapter.ex;

public class BankCard implements Account {
    private String id;
    private double amount;

    public BankCard(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double value) {
        amount = value;
    }
}
