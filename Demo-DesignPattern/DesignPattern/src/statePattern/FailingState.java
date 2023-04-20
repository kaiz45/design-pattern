package statePattern;

class FailingState implements GradeState {
    @Override
    public void update(Grade grade) {
        if (grade.getScore() >= 60) {
            grade.setState(new PassingState());
        }
    }
}
