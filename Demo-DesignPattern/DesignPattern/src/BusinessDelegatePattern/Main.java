package BusinessDelegatePattern;

public class Main {
    public static void main(String[] args) {
        SubjectServiceDelegate delegate = new SubjectServiceDelegate();

        delegate.enrollStudent("Alice", "COMP101");
        delegate.enrollStudent("Bob", "MATH101");
        delegate.withdrawStudent("Charlie", "COMP101");
        delegate.viewEnrolledStudents("MATH101");
    }
}

