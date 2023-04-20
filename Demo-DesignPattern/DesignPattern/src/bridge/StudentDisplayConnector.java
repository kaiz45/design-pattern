package bridge;

public abstract class StudentDisplayConnector {
    protected Student student;
    protected StudentDisplay studentDisplay;

    public StudentDisplayConnector(Student student, StudentDisplay studentDisplay) {
        this.student = student;
        this.studentDisplay = studentDisplay;
    }

    public abstract void display();
}
