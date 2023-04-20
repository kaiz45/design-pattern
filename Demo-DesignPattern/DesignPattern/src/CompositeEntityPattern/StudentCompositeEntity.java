package CompositeEntityPattern;

public class StudentCompositeEntity {
    private StudentEntity student = new StudentEntity();
    private SubjectEntity subject = new SubjectEntity();

    public void setStudentName(String name) {
        student.setName(name);
    }

    public String getStudentName() {
        return student.getName();
    }

    public void setSubjectCode(String code) {
        subject.setCode(code);
    }

    public String getSubjectCode() {
        return subject.getCode();
    }

    public void setGrade(String grade) {
        subject.setGrade(grade);
    }

    public String getGrade() {
        return subject.getGrade();
    }

    public void setData(String name, String code, String grade) {
        student.setName(name);
        subject.setCode(code);
        subject.setGrade(grade);
    }

    public String[] getData() {
        return new String[]{ student.getName(), subject.getCode(), subject.getGrade() };
    }
}

