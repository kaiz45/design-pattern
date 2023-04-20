package NullObjectPattern;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = findCourse("Math");
        System.out.println("Math course name: " + mathCourse.getName());

        Course historyCourse = findCourse("History");
        System.out.println("History course name: " + historyCourse.getName());

        Course nonExistentCourse = findCourse("Basketweaving");
        System.out.println("Basketweaving course name: " + nonExistentCourse.getName());
    }

    // Find a course by name
    public static Course findCourse(String name) {
        boolean courseExists = true;

        if (courseExists) {
            return new RealCourse(name);
        } else {
            return new NullCourse();
        }
    }
}
