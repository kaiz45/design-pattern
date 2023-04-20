package mementoPattern;

import java.util.List;

public class GradeMemento {
    private List<Exam> exams;

    public GradeMemento(List<Exam> exams) {
        this.exams = exams;
    }

    public List<Exam> getExams() {
        return exams;
    }
}


