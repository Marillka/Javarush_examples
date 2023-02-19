package шаблоны_порождающие_creational.шаблон_абстрактнаяФабрика_abstractFactory;

public class Main {
    public static void main(String[] args) {

        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);


        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

    }
}
