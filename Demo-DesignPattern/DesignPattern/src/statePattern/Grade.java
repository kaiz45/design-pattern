package statePattern;

public class Grade {
    private GradeState state;
    private String studentName;
    private double score;

    public Grade(String studentName, double score) {
        this.studentName = studentName;
        this.score = score;
        this.state = new PassingState();
    }

    public void setState(GradeState state) {
        this.state = state;
    }

    public void setScore(double score) {
        this.score = score;
        state.update(this);
    }

    public String getStudentName() {
        return studentName;
    }

    public double getScore() {
        return score;
    }
}
