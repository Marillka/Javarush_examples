package шаблоны_поведенческие_behavioral.Visitor_Посетитель.ex1;

public interface Visitor {
    void visit(SportCar sportCar);
    void visit(Engine engine);
    void visit(Wheel wheel);
}
