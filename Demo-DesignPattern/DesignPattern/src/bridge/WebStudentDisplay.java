package bridge;

public class WebStudentDisplay implements StudentDisplay {
    @Override
    public void display(Student student) {
        System.out.println("Displaying student on web");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
    }
}