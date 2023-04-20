package proxy;

public class StudentProxy implements Person {
    private Student student;
    private String name;

    public StudentProxy(String name) {
        this.name = name;
    }

    public void enter() {
        if(isRegistered()) {
            student = new Student(name);
            student.enter();
        } else {
            System.out.println(name + " is not registered in the school.");
        }
    }

    public void leave() {
        if(student != null) {
            student.leave();
            student = null;
        } else {
            System.out.println(name + " has not entered the school yet.");
        }
    }

    private boolean isRegistered() {
        // Check if the student is registered in the school
        return true;
    }
}
