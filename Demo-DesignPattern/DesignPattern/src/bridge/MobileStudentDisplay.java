package bridge;

public class MobileStudentDisplay implements StudentDisplay {
    @Override
    public void display(Student student) {
        System.out.println("Displaying student on mobile");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
    }
}