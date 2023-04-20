package interpreter;

public class ScienceExpression implements Expression {
    @Override
    public boolean interpret(String context) {
        return context.contains("science");
    }
}