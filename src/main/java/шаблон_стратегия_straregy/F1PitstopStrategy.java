package шаблон_стратегия_straregy;

public class F1PitstopStrategy implements FillStrategy  {
    @Override
    public void fill() {
        System.out.println("Заправляем безнин только после всех остальных процедур пит-стопа!");
    }
}
