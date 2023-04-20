package DataAccessObjectPattern;

import java.util.List;

public interface SchoolDAO {
    List<School> getAllSchools();
    School getSchoolById(int id);
    void addSchool(School school);
    void updateSchool(School school);
    void deleteSchool(int id);
}

