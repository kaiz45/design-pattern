package DataAccessObjectPattern;

import java.util.List;

public class School {
    private int id;
    private String name;
    private String address;
    private List<Course> courses;

    public School(int id, String name, String address, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.courses = courses;
    }

    // constructors, getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

