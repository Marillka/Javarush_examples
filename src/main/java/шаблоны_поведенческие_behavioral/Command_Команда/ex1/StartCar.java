package шаблоны_поведенческие_behavioral.Command_Команда.ex1;

public class StartCar implements Command{
    Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }
}
