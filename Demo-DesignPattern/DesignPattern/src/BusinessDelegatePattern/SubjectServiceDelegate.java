package BusinessDelegatePattern;

public class SubjectServiceDelegate implements SubjectService {
    private SubjectService subjectService;

    public SubjectServiceDelegate() {
        subjectService = new SubjectServiceImpl();
    }

    public void enrollStudent(String studentName, String subjectCode) {
        subjectService.enrollStudent(studentName, subjectCode);
    }

    public void withdrawStudent(String studentName, String subjectCode) {
        subjectService.withdrawStudent(studentName, subjectCode);
    }

    public void viewEnrolledStudents(String subjectCode) {
        subjectService.viewEnrolledStudents(subjectCode);
    }
}
