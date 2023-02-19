package шаблоны_поведенческие_behavioral.Visitor_Посетитель.ex1;

public class VisitorTest {
    public static void main(String[] args) {
        Car computer = new SportCar();
        computer.accept(new CarVisitor());
    }
}
