package TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    // This is just a mock implementation, for demo purposes
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("John", 1, 80));
        students.add(new Student("Sarah", 2, 90));
        students.add(new Student("Mike", 3, 70));
    }

    public List<StudentTO> getAllStudents() {
        List<StudentTO> studentTOs = new ArrayList<>();

        for (Student student : students) {
            StudentTO studentTO = new StudentTO(student.getName(), student.getRollNo(), student.getMarks());
            studentTOs.add(studentTO);
        }

        return studentTOs;
    }

    public StudentTO getStudent(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                return new StudentTO(student.getName(), student.getRollNo(), student.getMarks());
            }
        }

        return null;
    }
}
