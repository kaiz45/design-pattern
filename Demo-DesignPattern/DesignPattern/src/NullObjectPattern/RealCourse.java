package NullObjectPattern;

public class RealCourse extends Course {
    public RealCourse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
