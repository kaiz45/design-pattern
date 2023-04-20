package decorator;

public class Pencil extends SchoolItemDecorator {
    public Pencil(SchoolItem schoolItem) {
        super(schoolItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pencil";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
