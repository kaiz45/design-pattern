package VisitorPattern;

public class Teacher implements Visitor {
    @Override
    public void visit(MathCourse mathCourse) {
        mathCourse.teachMath();
    }

    @Override
    public void visit(HistoryCourse historyCourse) {
        historyCourse.teachHistory();
    }
}
