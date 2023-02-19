package шаблоны_поведенческие_behavioral.Visitor_Посетитель.ex1;

public class CarVisitor implements Visitor {
    @Override
    public void visit(SportCar sportCar) {
        print("car");
    }

    @Override
    public void visit(Engine engine) {
        print("engine");
    }

    @Override
    public void visit(Wheel wheel) {
        print("wheel");
    }

    private void print(String string) {
        System.out.println(string);
    }
}
