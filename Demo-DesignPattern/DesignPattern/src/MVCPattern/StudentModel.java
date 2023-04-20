package MVCPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentModel {
    private String name;
    private int rollNo;
    private Map<String, Double> courseGrades;
    private StudentView view;

    public StudentModel(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.courseGrades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void addCourseGrade(String course, double grade) {
        courseGrades.put(course, grade);
        view.printStudentDetails(this);
    }

    public Map<String, Double> getCourseGrades() {
        return courseGrades;
    }

    public void setView(StudentView view) {
        this.view = view;
    }
}


