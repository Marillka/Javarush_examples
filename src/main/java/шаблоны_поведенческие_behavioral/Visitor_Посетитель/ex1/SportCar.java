package шаблоны_поведенческие_behavioral.Visitor_Посетитель.ex1;

public class SportCar implements Car {

    Car[] cars;

    public SportCar() {
        cars = new Car[]{new Engine(), new Wheel()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].accept(visitor);
        }
        visitor.visit(this);
    }


}
