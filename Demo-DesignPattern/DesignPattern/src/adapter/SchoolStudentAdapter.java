package adapter;

public class SchoolStudentAdapter implements StudentDisplay {
    private StudentManagementSystem studentManagementSystem;

    public SchoolStudentAdapter(StudentManagementSystem studentManagementSystem) {
        this.studentManagementSystem = studentManagementSystem;
    }

    @Override
    public void display(String id) {
        Student student = studentManagementSystem.getStudentById(id);
        System.out.println("Student name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student age: " + student.getAge());
    }
}
