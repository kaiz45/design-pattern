package MVCPattern;

import java.util.Map;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
        this.model.setView(view);
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentRollNo(int rollNo) {
        model.setRollNo(rollNo);
    }

    public void addCourseGrade(String course, double grade) {
        model.addCourseGrade(course, grade);
    }

    public void updateView() {
        view.printStudentDetails(model);
    }
}

