package шаблоны_порождающие_creational.шаблон_фабрика_factory.ex2;

public class Car implements Moveable {
    int speed;
    String color;
    Engine engine;

    public Car(int speed, String color, Engine engine) {
        this.speed = speed;
        this.color = color;
        this.engine = engine;
    }


    @Override
    public void start() {
        while (speed < 50) {
            speed++;
        }
    }

    @Override
    public void stop() {
        while (speed > 0) {
            speed--;
        }
    }
}
