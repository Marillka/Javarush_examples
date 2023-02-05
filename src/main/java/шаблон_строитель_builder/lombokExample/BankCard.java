package шаблон_строитель_builder.lombokExample;

import lombok.Builder;

@Builder
public class BankCard {
    private final String id;
    private final double amount;

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        BankCard card = BankCard.builder().id("123").amount(1340).build();
        System.out.println(card.getAmount() + " " + card.getId());
    }


}
