package BusinessDelegatePattern;

public interface SubjectService {
    public void enrollStudent(String studentName, String subjectCode);
    public void withdrawStudent(String studentName, String subjectCode);
    public void viewEnrolledStudents(String subjectCode);
}

