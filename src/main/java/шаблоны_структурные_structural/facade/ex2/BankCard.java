package шаблоны_структурные_structural.facade.ex2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BankCard implements Account, TransportCard {

    private static final Logger log = LoggerFactory.getLogger(BankCard.class);

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
