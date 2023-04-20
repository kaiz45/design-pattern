package factoryPattern;

public class Student implements SchoolMember {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return "student";
    }
}
