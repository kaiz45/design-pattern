package factoryPattern;

public class Teacher implements SchoolMember {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return "teacher";
    }
}
