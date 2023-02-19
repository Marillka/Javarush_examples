package шаблоны_структурные_structural.decorator.ex;

public class UnknownCar implements Car{
    @Override
    public void draw() {
        System.out.println("UnknownCar");
    }
}
