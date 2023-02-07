package структурные_паттерны.decorator.ex2;

import java.util.List;

public class BankCard implements Account {
    private String id;
    private BankAccount defaultAccount;
    private List<BankAccount> accountList;


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
