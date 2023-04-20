package DataAccessObjectPattern;

import java.util.*;

public class CourseDAOImpl implements CourseDAO {
    private List<Course> courses;

    public CourseDAOImpl() {
        courses = new ArrayList<Course>();
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public Course getCourseById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void updateCourse(Course course) {
        for (Course c : courses) {
            if (c.getId() == course.getId()) {
                c.setName(course.getName());
                c.setDescription(course.getDescription());
                c.setStudents(course.getStudents());
                break;
            }
        }
    }

    @Override
    public void deleteCourse(int id) {
        courses.removeIf(course -> course.getId() == id);
    }

}


