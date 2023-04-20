package mediatorPattern;

public class Main {
    public static void main(String[] args) {
        CourseMediator mediator = CourseMediator.getInstance();

        Course math = new Course("Math");
        Course history = new Course("History");
        Course science = new Course("Science");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");

        mediator.registerCourse(math);
        mediator.registerCourse(history);
        mediator.registerCourse(science);

        alice.register(math);
        alice.register(history);

        bob.register(history);
        bob.register(science);

        charlie.register(math);
        charlie.register(science);

        alice.sendAnnouncement("Math", "Homework due next week");
        bob.sendAnnouncement("History", "Quiz tomorrow");
        charlie.sendAnnouncement("Science", "Lab report due next class");
    }
}

