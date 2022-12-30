package подготовка.homework1.example2.good;

public class Lorry extends Car  {

    public Lorry(Engine engine, String color, String name) {
        super(engine, color, name);
    }

    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    void open() {

    }

    @Override
    void close() {

    }

    @Override
    void start() {

    }
}