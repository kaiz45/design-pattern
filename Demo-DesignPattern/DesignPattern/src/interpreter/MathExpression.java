package interpreter;

public class MathExpression implements Expression {
    @Override
    public boolean interpret(String context) {
        return context.contains("math");
    }
}
