package шаблон_фабрика;

public class CoffeeShop {

    private final SimpleCoffeeFactory simpleCoffeeFactory;

    public CoffeeShop(SimpleCoffeeFactory simpleCoffeeFactory) {
        this.simpleCoffeeFactory = simpleCoffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваше кофе, приходите еще!");
        return coffee;
    }
}
