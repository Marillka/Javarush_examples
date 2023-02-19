package шаблоны_структурные_structural.composite.ex2;

public class SportCar implements Car{
    @Override
    public void draw(String color) {
        System.out.println("SportCar color: " + color);
    }
}
