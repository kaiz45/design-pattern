package StrategyPattern;

class Grader {
    private GradingStrategy strategy;

    public Grader(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateGrade(double[] scores) {
        return strategy.calculateGrade(scores);
    }
}
