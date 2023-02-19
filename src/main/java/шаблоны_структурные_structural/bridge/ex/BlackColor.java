package шаблоны_структурные_structural.bridge.ex;

public class BlackColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Filling in black color");
    }
}
