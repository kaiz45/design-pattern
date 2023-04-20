package mediatorPattern;

import java.util.HashMap;
import java.util.Map;

public class CourseMediator {
    private static CourseMediator instance = new CourseMediator();
    private Map<String, Course> courses;

    private CourseMediator() {
        this.courses = new HashMap<>();
    }

    public static CourseMediator getInstance() {
        return instance;
    }

    public void registerCourse(Course course) {
        courses.put(course.getName(), course);
    }

    public void sendAnnouncement(String courseName, String message) {
        Course course = courses.get(courseName);
        if (course != null) {
            course.sendAnnouncement(message);
        } else {
            System.out.println("Invalid course name: " + courseName);
        }
    }
}
