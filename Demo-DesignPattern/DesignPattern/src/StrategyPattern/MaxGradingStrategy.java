package StrategyPattern;

class MaxGradingStrategy implements GradingStrategy {
    @Override
    public double calculateGrade(double[] scores) {
        double max = scores[0];
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
}
