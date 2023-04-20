package TemplatePattern;

class HistoryExam extends Exam {
    @Override
    public void readInstructions() {
        System.out.println("Reading history exam instructions...");
    }

    @Override
    public void takeTest() {
        System.out.println("Taking history exam...");
    }
}
