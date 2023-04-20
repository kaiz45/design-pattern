package observerPattern;

class GradeReport implements Observer {
    private String name;
    private double score;

    @Override
    public void update(String studentName, double score) {
        this.name = studentName;
        this.score = score;
        display();
    }

    private void display() {
        System.out.println(name + " has a new grade of " + score);
    }
}
