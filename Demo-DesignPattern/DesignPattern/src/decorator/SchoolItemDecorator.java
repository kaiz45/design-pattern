package decorator;

abstract class SchoolItemDecorator implements SchoolItem {
    protected SchoolItem schoolItem;

    public SchoolItemDecorator(SchoolItem schoolItem) {
        this.schoolItem = schoolItem;
    }

    public String getDescription() {
        return schoolItem.getDescription();
    }

    public double getCost() {
        return schoolItem.getCost();
    }
}
