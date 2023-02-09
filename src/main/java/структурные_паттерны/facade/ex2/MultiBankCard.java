package структурные_паттерны.facade.ex2;

import java.util.List;

public class MultiBankCard implements Account {
    private String id;
    private List<BankAccount> accountList;


    public MultiBankCard(String id) {
        this.id = id;
    }

    @Override
    public double getAmount() {
        return accountList.stream()
                .mapToDouble(bankAccount -> bankAccount.getAmount())
                .sum();
    }

    @Override
    public void setAmount(double value) {
        accountList.get(0).setAmount(value);
    }
}
