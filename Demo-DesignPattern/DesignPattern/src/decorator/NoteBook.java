package decorator;

public class NoteBook implements SchoolItem {
    @Override
    public String getDescription() {
        return "Notebook";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
