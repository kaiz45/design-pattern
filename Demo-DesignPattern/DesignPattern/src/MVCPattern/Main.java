package MVCPattern;

public class Main {
    public static void main(String[] args) {
        // create the model, view, and controller objects
        StudentModel model = new StudentModel("Alice", 123);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // update the model and view
        controller.setStudentName("Bob");
        controller.setStudentRollNo(456);
        controller.addCourseGrade("Math", 85.5);
        controller.addCourseGrade("English", 92.0);
        controller.updateView();
    }
}

