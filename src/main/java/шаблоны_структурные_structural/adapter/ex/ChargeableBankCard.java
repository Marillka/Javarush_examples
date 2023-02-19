package шаблоны_структурные_structural.adapter.ex;

public class ChargeableBankCard extends BankCard implements Chargeable {

    public ChargeableBankCard(String id, double amount) {
        super(id, amount);
    }

    @Override
    public void charge(double value) {
        setAmount(super.getAmount() - value);
    }

}
