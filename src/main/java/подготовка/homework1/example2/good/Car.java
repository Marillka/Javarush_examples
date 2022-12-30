package подготовка.homework1.example2.good;

abstract class Car {
    public Engine engine;
    public String color;
    public String name;

    public Car(Engine engine, String color, String name) {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    abstract void open();

    abstract void close();

    abstract void start();

    abstract void stop();

    abstract void move();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
