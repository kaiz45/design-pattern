package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        double[] mathScores = {80.0, 90.0, 75.0, 85.0};
        double[] historyScores = {95.0, 85.0, 90.0, 87.0};

        Grader mathGrader = new Grader(new AverageGradingStrategy());
        double mathGrade = mathGrader.calculateGrade(mathScores);
        System.out.println("Math grade: " + mathGrade);

        Grader historyGrader = new Grader(new MaxGradingStrategy());
        double historyGrade = historyGrader.calculateGrade(historyScores);
        System.out.println("History grade: " + historyGrade);
    }

}
