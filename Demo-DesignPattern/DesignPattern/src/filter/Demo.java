package filter;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20, 3.5));
        students.add(new Student("Alex", 22, 3.8));
        students.add(new Student("Sarah", 19, 3.2));
        students.add(new Student("Mike", 21, 3.6));

        StudentFilter filter = new StudentFilterImpl(3.5, 20);
        List<Student> filteredStudents = filter.filter(students);

        for (Student student : filteredStudents) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", GPA: " + student.getGPA());
        }
    }

}
