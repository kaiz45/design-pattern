package DataAccessObjectPattern;

import java.util.*;

public class SchoolDAOImpl implements SchoolDAO {
    private List<School> schools;

    public SchoolDAOImpl() {
        schools = new ArrayList<School>();
    }

    @Override
    public List<School> getAllSchools() {
        return schools;
    }

    @Override
    public School getSchoolById(int id) {
        for (School school : schools) {
            if (school.getId() == id) {
                return school;
            }
        }
        return null;
    }

    @Override
    public void addSchool(School school) {
        schools.add(school);
    }

    @Override
    public void updateSchool(School school) {
        for (School s : schools) {
            if (s.getId() == school.getId()) {
                s.setName(school.getName());
                s.setAddress(school.getAddress());
                s.setCourses(school.getCourses());
                break;
            }
        }
    }

    @Override
    public void deleteSchool(int id) {
        schools.removeIf(school -> school.getId() == id);
    }
}

