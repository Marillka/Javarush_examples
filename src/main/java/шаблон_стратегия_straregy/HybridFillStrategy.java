package шаблон_стратегия_straregy;

public class HybridFillStrategy implements FillStrategy  {

    @Override
    public void fill() {
        System.out.println("Заправляем бензином и электричеством на выбор");
    }

}
