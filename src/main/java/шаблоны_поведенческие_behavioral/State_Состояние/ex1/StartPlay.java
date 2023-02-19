package шаблоны_поведенческие_behavioral.State_Состояние.ex1;

public class StartPlay implements State {
    @Override
    public void doAction() {
        System.out.println("Start play");
    }
}
