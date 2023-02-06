package структурные_паттерны.bridge.ex;

public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
        color.fillColor();
    }
}
