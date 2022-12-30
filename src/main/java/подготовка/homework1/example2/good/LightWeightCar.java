package подготовка.homework1.example2.good;

public class LightWeightCar extends Car {


    public LightWeightCar(Engine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    void open() {
        System.out.println("Car is open");
    }


    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    void close() {

    }

    @Override
    void start() {

    }

    @Override
    void stop() {

    }
}
