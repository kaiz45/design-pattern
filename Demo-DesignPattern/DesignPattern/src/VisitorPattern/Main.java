package VisitorPattern;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new MathCourse();
        Course historyCourse = new HistoryCourse();

        Visitor teacher = new Teacher();

        mathCourse.accept(teacher);
        historyCourse.accept(teacher);
    }
}
