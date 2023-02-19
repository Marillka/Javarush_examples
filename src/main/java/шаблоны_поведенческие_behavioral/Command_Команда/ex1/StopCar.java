package шаблоны_поведенческие_behavioral.Command_Команда.ex1;

public class StopCar implements Command{
    Car car;

    public StopCar(Car car) {
        this.car = car;
    }


    @Override
    public void execute() {
        car.stopEngine();
    }
}
