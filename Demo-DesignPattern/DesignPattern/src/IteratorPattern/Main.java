package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        Course[] courses = {
                new Course("Math", "John Smith"),
                new Course("English", "Jane Doe"),
                new Course("Science", "Bob Johnson")
        };

        CourseList courseList = new CourseList(courses);
        CourseIterator iterator = courseList.getIterator();

        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println(course.getName() + " taught by " + course.getInstructor());
        }
    }
}

