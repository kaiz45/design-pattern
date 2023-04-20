package facade;

public class SchoolFacade {
    private Teacher teacher;
    private Student student;
    private Principal principal;

    public SchoolFacade() {
        teacher = new Teacher();
        student = new Student();
        principal = new Principal();
    }

    public void teachClass() {
        teacher.teach();
        student.study();
    }

    public void manageSchool() {
        principal.manage();
    }
}
