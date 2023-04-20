package abstractFactoryPattern;


public class HighSchoolStudent extends SchoolMember {
    public HighSchoolStudent(String name) {
        super(name);
    }

    public String getRole() {
        return "high school student";
    }
}
