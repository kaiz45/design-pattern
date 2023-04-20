package bridge;

public class WebStudentDisplayConnector extends StudentDisplayConnector {
    public WebStudentDisplayConnector(Student student, StudentDisplay studentDisplay) {
        super(student, studentDisplay);
    }

    @Override
    public void display() {
        studentDisplay.display(student);
    }
}