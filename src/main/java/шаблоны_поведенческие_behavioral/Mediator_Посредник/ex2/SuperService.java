package шаблоны_поведенческие_behavioral.Mediator_Посредник.ex2;

import java.util.Map;

public class SuperService {
    private final Map<String, CustomService> services;

    public SuperService(Map<String, CustomService> services) {
        this.services = services;
    }

    public void process(String command) {
        services.get(command).foo();
    }
}
