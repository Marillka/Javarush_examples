package шаблоны_поведенческие_behavioral.State_Состояние.ex1;

public class StopPlay implements State{
    @Override
    public void doAction() {
        System.out.println("Stop play");
    }
}
