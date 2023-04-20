package builderPattern;

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School.SchoolBuilder()
                .withName("My School")
                .withAddress("123 Main St.")
                .withNumStudents(1000)
                .withNumTeachers(50)
                .withIsPublic(true)
                .build();

        System.out.println("Name of school: " + school.getName());
        System.out.println("Address of school: " + school.getAddress());
        System.out.println("Number of students: " + school.getNumStudents());
        System.out.println("Number of teachers: " + school.getNumTeachers());
        System.out.println("Is the school public? " + school.isPublic());
    }
}
