package TransferObjectPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        // Get all students
        List<StudentTO> students = studentDAO.getAllStudents();
        for (StudentTO studentTO : students) {
            System.out.println("Name: " + studentTO.getName() + ", Roll No: " + studentTO.getRollNo() + ", Marks: " + studentTO.getMarks());
        }

        // Get a single student
        StudentTO student = studentDAO.getStudent(2);
        if (student != null) {
            System.out.println("Name: " + student.getName() + ", Roll No: " + student.getRollNo() + ", Marks: " + student.getMarks());
        } else {
            System.out.println("Student not found");
        }
    }
}

