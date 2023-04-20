package mementoPattern;

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade();

        grade.addExam(new Exam("Math", 90));
        grade.addExam(new Exam("Science", 85));
        grade.addExam(new Exam("History", 95));

        grade.printExams();

        GradeMemento memento = grade.saveExamsToMemento();

        grade.addExam(new Exam("English", 80));

        grade.printExams();

        grade.restoreExamsFromMemento(memento);

        grade.printExams();
    }
}

