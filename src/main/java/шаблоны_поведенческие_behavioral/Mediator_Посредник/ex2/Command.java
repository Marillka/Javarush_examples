package шаблоны_поведенческие_behavioral.Mediator_Посредник.ex2;

public enum Command {
    COMMAND1("CustomServiceImpl1"),
    COMMAND2("CustomServiceImpl2"),
    COMMAND3("CustomServiceImpl3");
    private final String bean;

    Command(String bean) {
        this.bean = bean;
    }

    public String getBean() {
        return bean;
    }
}
