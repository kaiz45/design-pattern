package BusinessDelegatePattern;

public class SubjectServiceImpl implements SubjectService {
    public void enrollStudent(String studentName, String subjectCode) {
        System.out.println("Enrolling student " + studentName + " in subject " + subjectCode);
    }

    public void withdrawStudent(String studentName, String subjectCode) {
        System.out.println("Withdrawing student " + studentName + " from subject " + subjectCode);
    }

    public void viewEnrolledStudents(String subjectCode) {
        System.out.println("Viewing enrolled students for subject " + subjectCode);
    }
}

