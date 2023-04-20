package DataAccessObjectPattern;

import java.util.List;

public interface CourseDAO {
    List<Course> getAllCourses();
    Course getCourseById(int id);
    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(int id);
}

