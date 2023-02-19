package шаблоны_поведенческие_behavioral.Interpreter_Интерпретатор.ex1;

public class UpperExpression implements Expression {
    private String s;

    public UpperExpression(String s) {
        this.s = s;
    }

    @Override
    public String interpret(Context context) {
        return context.getUpperCase(s);
    }
}
