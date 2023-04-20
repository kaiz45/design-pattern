package decorator;

public class Demo {
    public static void main(String[] args) {
        SchoolItem notebook = new NoteBook();
        notebook = new Pen(notebook);
        notebook = new Pencil(notebook);

        System.out.println("Description: " + notebook.getDescription());
        System.out.println("Cost: $" + notebook.getCost());
    }
}
