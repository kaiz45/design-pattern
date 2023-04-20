package bridge;

public class Demo {
    public static void main(String[] args) {
        Student student = new SchoolStudent("John", "001", 20);
        StudentDisplay webDisplay = new WebStudentDisplay();
        StudentDisplay mobileDisplay = new MobileStudentDisplay();
        StudentDisplayConnector webConnector = new WebStudentDisplayConnector(student, webDisplay);
        webConnector.display();

        StudentDisplayConnector mobileConnector = new MobileStudentDisplayConnector(student, mobileDisplay);
        mobileConnector.display();
    }
}
