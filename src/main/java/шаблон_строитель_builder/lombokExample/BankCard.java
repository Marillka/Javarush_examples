package шаблон_строитель_builder.lombokExample;

public class BankCard {
    private final String id;
    private final double amount;


    static class Builder {
        String id;
        double amount;

        Builder id(String id) {
            this.id = id;
            return this;
        }

        Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public BankCard build() {
            return new BankCard(this.id, this.amount);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public BankCard(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public static void main(String[] args) {
        BankCard card = BankCard.builder().id("123").amount(1340).build();
        System.out.println(card.getAmount() + " " + card.getId());
    }


}
