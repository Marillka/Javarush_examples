package шаблоны_структурные_structural.proxy.ex2;

public class Proxy implements Account {
    private final Control control;
    private final Account account;

    public static Account proxy(Account account) {
        Control control = () -> {
            //something
        };
        return new Proxy(control, account);
    }

    public Proxy(Control control, Account account) {
        this.control = control;
        this.account = account;
    }

    @Override
    public double getAmount() {
        control.control();
        return account.getAmount();
    }

    @Override
    public void setAmount(double value) {
        control.control();
        account.setAmount(value);
    }
}
