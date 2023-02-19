package шаблоны_поведенческие_behavioral.Command_Команда.ex1;

public class CarInvoker {
    public Command command;

    public CarInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
