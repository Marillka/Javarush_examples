package solid.dependency_iversion;

public class Main {
    Car toyota = CarFactory.makeCar(30, "blue", new Engine());
    Car volvo = CarFactory.makeCar(50, "white", new Engine());
}
