package bridge;

public class MobileStudentDisplayConnector extends StudentDisplayConnector  {
    public MobileStudentDisplayConnector(Student student, StudentDisplay studentDisplay) {
        super(student, studentDisplay);
    }

    @Override
    public void display() {
        studentDisplay.display(student);
    }
}
