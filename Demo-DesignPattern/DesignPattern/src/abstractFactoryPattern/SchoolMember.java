package abstractFactoryPattern;

public abstract class SchoolMember {
    private String name;

    public SchoolMember(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getRole();
}

