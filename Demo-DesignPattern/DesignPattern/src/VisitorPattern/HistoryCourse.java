package VisitorPattern;

class HistoryCourse implements Course {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void teachHistory() {
        System.out.println("Teaching history...");
    }
}
