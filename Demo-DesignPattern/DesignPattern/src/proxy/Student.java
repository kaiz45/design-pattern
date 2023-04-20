package proxy;

public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enter() {
        System.out.println(name + " has entered the school.");
    }

    public void leave() {
        System.out.println(name + " has left the school.");
    }
}
