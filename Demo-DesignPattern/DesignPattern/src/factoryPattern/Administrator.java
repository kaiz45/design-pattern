package factoryPattern;

public class Administrator implements SchoolMember {
    private String name;

    public Administrator(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return "administrator";
    }
}
