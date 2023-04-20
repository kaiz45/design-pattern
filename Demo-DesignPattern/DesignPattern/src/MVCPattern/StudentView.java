package MVCPattern;

public class StudentView {
    public void printStudentDetails(StudentModel model) {
        System.out.println("Student Details:");
        System.out.println("Name: " + model.getName());
        System.out.println("Roll No: " + model.getRollNo());
        System.out.println("Course Grades: " + model.getCourseGrades());
    }
}

