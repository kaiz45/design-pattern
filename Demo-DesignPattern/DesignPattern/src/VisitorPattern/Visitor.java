package VisitorPattern;

interface Visitor {
    void visit(MathCourse mathCourse);

    void visit(HistoryCourse historyCourse);
}
