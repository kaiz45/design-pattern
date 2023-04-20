package composite;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements Component {
    private String name;
    private List<Component> students = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }

    public void addStudent(Component student) {
        students.add(student);
    }

    public void removeStudent(Component student) {
        students.remove(student);
    }

    @Override
    public void displayInformation() {
        System.out.println("Classroom: " + name);
        System.out.println("Students:");
        for (Component student : students) {
            student.displayInformation();
        }
    }
}
