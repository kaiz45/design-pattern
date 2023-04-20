package factoryPattern;

public class SchoolMemberFactory {
    public SchoolMember createSchoolMember(String name, String role) {
        switch (role) {
            case "student":
                return new Student(name);
            case "teacher":
                return new Teacher(name);
            case "administrator":
                return new Administrator(name);
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }
}
