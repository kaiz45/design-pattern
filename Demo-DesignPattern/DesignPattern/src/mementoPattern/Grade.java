package mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private List<Exam> exams = new ArrayList<>();

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public void removeExam(Exam exam) {
        exams.remove(exam);
    }

    public void printExams() {
        for (Exam exam : exams) {
            System.out.println(exam.getName() + ": " + exam.getScore());
        }
    }

    public GradeMemento saveExamsToMemento() {
        return new GradeMemento(new ArrayList<>(exams));
    }

    public void restoreExamsFromMemento(GradeMemento memento) {
        exams = new ArrayList<>(memento.getExams());
    }
}


