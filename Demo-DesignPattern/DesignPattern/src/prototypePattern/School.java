package prototypePattern;

public class School implements CloneableSchool {
    private String name;
    private String address;
    private int numStudents;
    private int numTeachers;
    private boolean isPublic;

    public School(String name, String address, int numStudents, int numTeachers, boolean isPublic) {
        this.name = name;
        this.address = address;
        this.numStudents = numStudents;
        this.numTeachers = numTeachers;
        this.isPublic = isPublic;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getNumStudents() {
        return this.numStudents;
    }

    public int getNumTeachers() {
        return this.numTeachers;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    @Override
    public School clone() {
        try {
            return (School) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public void setNumTeachers(int numTeachers) {
        this.numTeachers = numTeachers;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }
}
