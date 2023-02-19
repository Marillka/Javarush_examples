package шаблоны_поведенческие_behavioral.State_Состояние.ex1;

public class StateTest {
    public static void main(String[] args) {
        PlayContext playContext = new PlayContext();
        State startPlay = new StartPlay();
        State stopPlay = new StopPlay();

        playContext.setState(startPlay);
        playContext.doAction();

        playContext.setState(stopPlay);
        playContext.doAction();
    }
}
