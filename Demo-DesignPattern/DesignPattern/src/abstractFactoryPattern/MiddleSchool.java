package abstractFactoryPattern;

public class MiddleSchool extends School {
    public SchoolMember createSchoolMember(String name) {
        return new MiddleSchoolStudent(name);
    }
}
