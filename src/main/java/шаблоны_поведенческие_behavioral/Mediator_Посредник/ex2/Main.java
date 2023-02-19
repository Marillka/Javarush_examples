package шаблоны_поведенческие_behavioral.Mediator_Посредник.ex2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Command command = Command.COMMAND1;
        HashMap<String, CustomService> map = new HashMap<>();
        map.put("CustomServiceImpl1", new CustomServiceImpl1());
        map.put("CustomServiceImpl2", new CustomServiceImpl2());
        map.put("CustomServiceImpl3", new CustomServiceImpl3());
        SuperService mediator = new SuperService(map);
        mediator.process(command.getBean());

    }
}
