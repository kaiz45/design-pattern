package adapter;

public class SchoolStudent implements Student {
    private String name;
    private String id;
    private int age;

    public SchoolStudent(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}

