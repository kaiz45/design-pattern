package mediatorPattern;

import java.util.*;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void register(Course course) {
        courses.add(course);
        course.register(this);
    }

    public void receiveAnnouncement(String courseName, String message) {
        System.out.println(name + " received announcement for " + courseName + ": " + message);
    }

    public void sendAnnouncement(String courseName, String message) {
        CourseMediator.getInstance().sendAnnouncement(courseName, message);
    }
}

