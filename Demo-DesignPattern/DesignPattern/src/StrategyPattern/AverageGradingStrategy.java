package StrategyPattern;

class AverageGradingStrategy implements GradingStrategy {
    @Override
    public double calculateGrade(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
