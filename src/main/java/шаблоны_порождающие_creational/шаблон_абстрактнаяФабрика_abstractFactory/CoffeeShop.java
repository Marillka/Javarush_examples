package шаблоны_порождающие_creational.шаблон_абстрактнаяФабрика_abstractFactory;

public abstract class CoffeeShop {


    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваше кофе, приходите еще!");
        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);
}
