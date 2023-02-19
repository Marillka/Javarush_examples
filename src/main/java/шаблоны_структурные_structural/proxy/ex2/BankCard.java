package шаблоны_структурные_structural.proxy.ex2;


public class BankCard implements Account, TransportCard {


    private String id;
    private BankAccount defaultAccount;
    private TransportCard transportCard;

    @Override
    public void payForTrip() {
        transportCard.payForTrip();
    }

    public BankCard(String id) {
        this.id = id;
    }

    @Override
    public double getAmount() {
        return defaultAccount.getAmount();
    }

    @Override
    public void setAmount(double value) {
        defaultAccount.setAmount(value);
    }
}
