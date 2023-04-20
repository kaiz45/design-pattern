package decorator;

public class Pen extends SchoolItemDecorator {
    public Pen(SchoolItem schoolItem) {
        super(schoolItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pen";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}