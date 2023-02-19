package шаблоны_поведенческие_behavioral.Interpreter_Интерпретатор.ex1;

public class LowerExpression implements Expression{
    private String s;

    public LowerExpression(String s) {
        this.s = s;
    }

    @Override
    public String interpret(Context context) {
        return context.getLowerCase(s);
    }
}
