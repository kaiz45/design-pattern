package CompositeEntityPattern;

public class Main {
    public static void main(String[] args) {
        StudentCompositeEntity student = new StudentCompositeEntity();
        student.setData("Alice", "COMP101", "A");
        printStudentData(student);

        student.setGrade("B");
        printStudentData(student);
    }

    private static void printStudentData(StudentCompositeEntity student) {
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Subject Code: " + student.getSubjectCode());
        System.out.println("Subject Grade: " + student.getGrade());
    }
}
