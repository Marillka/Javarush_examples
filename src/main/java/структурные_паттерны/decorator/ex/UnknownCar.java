package структурные_паттерны.decorator.ex;

public class UnknownCar implements Car{
    @Override
    public void draw() {
        System.out.println("UnknownCar");
    }
}
