package TemplatePattern;

class MathExam extends Exam {
    @Override
    public void readInstructions() {
        System.out.println("Reading math exam instructions...");
    }

    @Override
    public void takeTest() {
        System.out.println("Taking math exam...");
    }
}
