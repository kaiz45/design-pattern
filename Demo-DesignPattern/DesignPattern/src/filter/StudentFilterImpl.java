package filter;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterImpl implements StudentFilter {
    private double minGPA;
    private int minAge;

    public StudentFilterImpl(double minGPA, int minAge) {
        this.minGPA = minGPA;
        this.minAge = minAge;
    }

    @Override
    public List<Student> filter(List<Student> students) {
        List<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getGPA() >= minGPA && student.getAge() >= minAge) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents;
    }
}

