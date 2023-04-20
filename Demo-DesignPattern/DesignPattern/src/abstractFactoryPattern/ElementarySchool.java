package abstractFactoryPattern;

public class ElementarySchool extends School {
    public SchoolMember createSchoolMember(String name) {
        return new ElementarySchoolStudent(name);
    }
}