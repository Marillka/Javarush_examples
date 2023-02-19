package шаблоны_структурные_structural.bridge.ex;

public class RedColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Filling in red color");
    }
}
