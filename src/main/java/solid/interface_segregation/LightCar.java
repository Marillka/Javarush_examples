package solid.interface_segregation;

interface Carable {
    void start();
    void stop();
    void turnRight();
    void turnLeft();
}

interface Moveable {
    void start();
    void stop();
}

interface Turnable {
    void turnRight();
    void turnLeft();
}
public class LightCar implements Carable{
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft() {

    }
}

class HeavyCar implements Moveable, Turnable {
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft() {

    }
}
