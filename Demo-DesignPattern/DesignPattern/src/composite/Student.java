package composite;

public class Student implements Component {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
