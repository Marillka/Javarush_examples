package шаблон_фабричный_метод;

public class ItalianCoffeeShop extends CoffeeShop {

    @Override
    protected Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappucino();
                break;
            case CAFFE_LATTE:
                coffee = new ItalianStyleCaffeLatte();
                break;
        }

        return coffee;
    }
}
