package observerPattern;

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade("John Doe", 90.0);

        GradeReport report1 = new GradeReport();
        GradeReport report2 = new GradeReport();

        grade.registerObserver(report1);
        grade.registerObserver(report2);

        grade.setScore(95.0);
    }
}
