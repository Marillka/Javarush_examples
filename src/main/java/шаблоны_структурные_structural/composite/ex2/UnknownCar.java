package шаблоны_структурные_structural.composite.ex2;

public class UnknownCar implements Car{
    @Override
    public void draw(String color) {
        System.out.println("UnknownCar color: " + color);
    }
}
