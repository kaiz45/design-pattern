package adapter;

public class SchoolStudentManagementSystem implements StudentManagementSystem {
    @Override
    public Student getStudentById(String id) {
        return new SchoolStudent("John Smith", "1234", 18);
    }
}

