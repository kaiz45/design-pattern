package statePattern;

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade("John Doe", 80.0);
        System.out.println(grade.getStudentName() + " has a score of " + grade.getScore());

        grade.setScore(40.0);
        System.out.println(grade.getStudentName() + " has a score of " + grade.getScore());

        grade.setScore(90.0);
        System.out.println(grade.getStudentName() + " has a score of " + grade.getScore());
    }
}
