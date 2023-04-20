package composite;

public class SchoolDemo {
    public static void main(String[] args) {
        Component student1 = new Student("John Doe", 20);
        Component student2 = new Student("Jane Doe", 21);

        Component classroom = new Classroom("Class A");
        ((Classroom) classroom).addStudent(student1);
        ((Classroom) classroom).addStudent(student2);
        ((Classroom) classroom).addStudent(student1);

        classroom.displayInformation();
    }
}
