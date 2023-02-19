package шаблоны_поведенческие_behavioral.Strategy.ex1;

public class StandartFillStrategy implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Просто заправляем бензин");
    }
}
