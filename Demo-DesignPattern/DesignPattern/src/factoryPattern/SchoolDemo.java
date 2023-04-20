package factoryPattern;

public class SchoolDemo {
    public static void main(String[] args) {
        SchoolMemberFactory factory = new SchoolMemberFactory();

        SchoolMember student1 = factory.createSchoolMember("Alice", "student");
        SchoolMember teacher1 = factory.createSchoolMember("Bob", "teacher");
        SchoolMember admin1 = factory.createSchoolMember("Carol", "administrator");

        System.out.println(student1.getName() + " is a " + student1.getRole());
        System.out.println(teacher1.getName() + " is a " + teacher1.getRole());
        System.out.println(admin1.getName() + " is an " + admin1.getRole());
    }
}

