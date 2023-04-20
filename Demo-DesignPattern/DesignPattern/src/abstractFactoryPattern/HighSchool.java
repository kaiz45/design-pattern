package abstractFactoryPattern;

public class HighSchool extends School {
    public SchoolMember createSchoolMember(String name) {
        return new HighSchoolStudent(name);
    }
}
