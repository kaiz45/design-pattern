package abstractFactoryPattern;

public class MiddleSchoolStudent extends SchoolMember {
    public MiddleSchoolStudent(String name) {
        super(name);
    }

    public String getRole() {
        return "middle school student";
    }
}
