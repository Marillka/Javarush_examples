package структурные_паттерны.bridge.ex;

public class RedColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Filling in red color");
    }
}
