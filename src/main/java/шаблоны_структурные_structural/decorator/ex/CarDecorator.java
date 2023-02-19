package шаблоны_структурные_structural.decorator.ex;

public abstract class CarDecorator implements Car {
    protected Car decorated;

    public CarDecorator(Car decorated) {
        this.decorated = decorated;
    }

    public void draw() {
        decorated.draw();
    }
}
