package структурные_паттерны.bridge.ex;

public class GreenColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Filling in green color");
    }
}
