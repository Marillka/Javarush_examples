package структурные_паттерны.bridge.ex;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract  void draw();
}
