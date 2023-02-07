package структурные_паттерны.decorator.ex;

public class BlueCarDecorator extends CarDecorator {

    public BlueCarDecorator(Car decorated) {
        super(decorated);
    }

    public void draw() {
        decorated.draw();
        setColor();
    }

    private void setColor() {
        System.out.println("Color: red");
    }

}
