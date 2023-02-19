package шаблоны_поведенческие_behavioral.Visitor_Посетитель.ex1;

public class Engine implements Car{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
