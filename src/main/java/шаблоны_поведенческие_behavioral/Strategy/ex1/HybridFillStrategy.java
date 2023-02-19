package шаблоны_поведенческие_behavioral.Strategy.ex1;

public class HybridFillStrategy implements FillStrategy  {

    @Override
    public void fill() {
        System.out.println("Заправляем бензином и электричеством на выбор");
    }

}
