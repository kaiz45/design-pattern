package proxy;

public class School {
    public static void main(String[] args) {
        Person student1 = new StudentProxy("John");
        Person student2 = new StudentProxy("Jane");

        student1.enter();
        student2.leave();
    }
}
