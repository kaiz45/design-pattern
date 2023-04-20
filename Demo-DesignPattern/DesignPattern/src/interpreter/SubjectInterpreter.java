package interpreter;

public class SubjectInterpreter {
    private Expression expression;

    public SubjectInterpreter(Expression expression) {
        this.expression = expression;
    }

    public boolean interpret(String context) {
        return expression.interpret(context);
    }
}
