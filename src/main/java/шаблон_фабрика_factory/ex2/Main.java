package шаблон_фабрика_factory.ex2;
/*
Фабрика, как и в жизни, - это завод, который создает другие объекты. Фабрика помогает реализовать принцип слабой связанности компонентов.
 */
public class Main {

    Car toyota = CarFactory.makeCar(30, "blue", new Engine());
    Car volvo = CarFactory.makeCar(50, "white", new Engine());
}
