package VisitorPattern;

class MathCourse implements Course {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void teachMath() {
        System.out.println("Teaching math...");
    }
}
