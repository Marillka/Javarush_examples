package структурные_паттерны.decorator.ex2;

import java.util.List;

public class MultiBankCard implements Account {
    private String id;
    private List<BankAccount> accountList;


    public MultiBankCard(String id) {
        this.id = id;
    }

    @Override
    public double getAmount() {
        double result = 0;
        accountList.stream().forEach(a -> result+= a.getAmount());
    }

    @Override
    public void setAmount(double value) {
        defaultAccount.setAmount(value);
    }
}
