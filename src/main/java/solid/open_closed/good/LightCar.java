package solid.open_closed.good;

interface IEngine {
    void startEngine();
}

class Engine implements IEngine {
    @Override
    public void startEngine() {}
}

class NewEngine implements IEngine {
    @Override
    public void startEngine() {}
}

public class LightCar {
    IEngine engine;
    void startCar() {};
}
