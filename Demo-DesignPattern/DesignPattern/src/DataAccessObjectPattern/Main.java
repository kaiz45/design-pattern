package DataAccessObjectPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SchoolDAO schoolDAO = new SchoolDAOImpl();
        CourseDAO courseDAO = new CourseDAOImpl();
        // create a new school
        School school = new School(1, "Example School", "123 Main St", new ArrayList<Course>());
        schoolDAO.addSchool(school);


        Course course = new Course(1, "Math", "Learn math concepts", new ArrayList<Student>());
        courseDAO.addCourse(course);


        List<Course> courses = school.getCourses();
        courses.add(course);
        school.setCourses(courses);
        schoolDAO.updateSchool(school);


        Student student = new Student(1, "John Smith", "john.smith@example.com");
        List<Student> students = course.getStudents();
        students.add(student);
        course.setStudents(students);
        courseDAO.updateCourse(course);


        courseDAO.getAllCourses().forEach(System.out::println);
        schoolDAO.getAllSchools().forEach(System.out::println);

    }
}
