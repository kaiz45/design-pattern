package abstractFactoryPattern;

public class ElementarySchoolStudent extends SchoolMember {
    public ElementarySchoolStudent(String name) {
        super(name);
    }

    public String getRole() {
        return "elementary school student";
    }
}