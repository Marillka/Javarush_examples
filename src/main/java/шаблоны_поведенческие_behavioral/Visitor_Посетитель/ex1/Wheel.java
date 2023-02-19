package шаблоны_поведенческие_behavioral.Visitor_Посетитель.ex1;

public class Wheel implements Car{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
