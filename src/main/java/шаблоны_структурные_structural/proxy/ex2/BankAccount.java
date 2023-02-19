package шаблоны_структурные_structural.proxy.ex2;

import java.util.Currency;

public class BankAccount implements Account {

    private Currency currency;// валюта для банковской карты
    private double amount;

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public void setAmount(double value) {

    }
}
