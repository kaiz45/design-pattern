package mediatorPattern;

import java.util.*;

public class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void register(Student student) {
        students.add(student);
    }

    public void sendAnnouncement(String message) {
        System.out.println("Announcement for " + name + ": " + message);
        for (Student student : students) {
            student.receiveAnnouncement(name, message);
        }
    }
}

