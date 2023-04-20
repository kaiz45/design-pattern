package interpreter;

public class Demo {
    public static void main(String[] args) {
        Expression mathExpression = new MathExpression();
        Expression englishExpression = new EnglishExpression();
        Expression scienceExpression = new ScienceExpression();

        SubjectInterpreter mathInterpreter = new SubjectInterpreter(mathExpression);
        SubjectInterpreter englishInterpreter = new SubjectInterpreter(englishExpression);
        SubjectInterpreter scienceInterpreter = new SubjectInterpreter(scienceExpression);

        String context = "I am teaching math today.";

        System.out.println("Does the context involve math? " + mathInterpreter.interpret(context));
        System.out.println("Does the context involve english? " + englishInterpreter.interpret(context));
        System.out.println("Does the context involve science? " + scienceInterpreter.interpret(context));
    }

}
