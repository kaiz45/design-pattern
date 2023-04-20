package interpreter;

public class EnglishExpression implements Expression {
    @Override
    public boolean interpret(String context) {
        return context.contains("english");
    }
}

