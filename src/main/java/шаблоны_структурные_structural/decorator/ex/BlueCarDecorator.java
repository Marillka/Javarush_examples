package шаблоны_структурные_structural.decorator.ex;

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
