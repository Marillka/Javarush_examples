package шаблоны_поведенческие_behavioral.Interpreter_Интерпретатор.ex1;

public class InterpreterTest {
    public static void main(String[] args) {
        String str = "Test";
        Context context = new Context();

        Expression loverExpression = new LowerExpression(str);
        str = loverExpression.interpret(context);
        System.out.println(str);

        Expression upperExpression = new UpperExpression(str);
        str = upperExpression.interpret(context);
        System.out.println(str);
    }
}
