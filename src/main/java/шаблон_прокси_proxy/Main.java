package шаблон_прокси_proxy;

/*
Относится к структурным шаблонам проектирования, встречается в известном фреймворке Hibernate. Его задача - замещать объект, добавляя определенную функциональность.
 */
public class Main {


    public static void main(String[] args) {
        CarProxy car = new CarProxy(new Car(), true);
        car.speedUp();
        car.speedDown();
    }
}
