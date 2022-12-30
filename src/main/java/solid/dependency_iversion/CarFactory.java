package solid.dependency_iversion;

public class CarFactory {
    public static Car makeCar(int speed, String color, Engine engine) {
        return new Car(speed, color, engine);
    }
}
