package adapter;

public class SchoolDemo {
    public static void main(String[] args) {
        StudentManagementSystem sms = new SchoolStudentManagementSystem();
        StudentDisplay display = new SchoolStudentAdapter(sms);
        display.display("1234");
    }
}

