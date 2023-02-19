package шаблоны_структурные_structural.proxy.ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankCardWithFraudControl extends BankCard {

    private static final Logger log = LoggerFactory.getLogger(BankCard.class);

    public BankCardWithFraudControl(String id) {
        super(id);
    }

    @Override
    public double getAmount() {
        log.info("call getAmount");
        return super.getAmount();
    }

    @Override
    public void setAmount(double value) {
        log.info("call getAmount");
        super.setAmount(value);
    }
}
